import json
import os
import re
import requests
import time
from datetime import datetime
from dotenv import load_dotenv
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from kafka import KafkaProducer


path1 = "../.env"
if os.path.isfile(path1):
    load_dotenv(path1)

KAFKA_IP = os.getenv("KAFKA_IP")
KAFKA_PORT = int(os.getenv("KAFKA_PORT_EXT"))
FIWARE2KAFKA_PORT = int(os.getenv("FIWARE2KAFKA_PORT_EXT"))
FIWARE2KAFKA_IP = os.getenv("FIWARE2KAFKA_IP")
RAW_TOPIC = os.getenv("RAW_TOPIC")
ORION_PORT_EXT = int(os.getenv("ORION_PORT_EXT"))
ORION_IP = os.getenv("ORION_IP")
ORION_URL = "http://" + ORION_IP + ":" + str(ORION_PORT_EXT) + "/v2"
producer = KafkaProducer(bootstrap_servers=[KAFKA_IP + ":" + str(KAFKA_PORT)], api_version=(0, 11, 5), value_serializer=lambda x: json.dumps(x).encode('utf-8'))

def do_register_subscription(data):
    r = requests.get(url=ORION_URL + "/subscriptions?limit=1000")
    subscriptions = json.loads(r.text)
    new_description = data["description"]
    new_url = data["notification"]["http"]["url"]
    for subscription in subscriptions:
        old_id = subscription["id"]
        old_description = subscription["description"] if "description" in subscription else ""
        old_url = subscription["notification"]["http"]["url"]
        if new_description == old_description or new_url == old_url:  # the subscription already existed
            x = requests.delete(url=ORION_URL + "/subscriptions/" + old_id)  # delete it
            print("Replacing subscription:")
            print("--- Old: " + str(subscription))
            print("--- New: " + str(data))
            assert x.status_code == 204
    x = requests.post(url=ORION_URL + "/subscriptions", data=json.dumps(data), headers={'Content-type': 'application/json'})
    if x.status_code != 201:
        print("Failed to register subscription. Status code: " + str(x.status_code))
        print("Error response: " + x.text)
    return x.status_code
    
class S(BaseHTTPRequestHandler):

    def do_fiware2kafka(self, data):
        now = datetime.now()
        if "heartbeat" in data:
            print("Alive at " + now.strftime("%m/%d/%Y, %H:%M:%S"))
            return
        # print("Working on request at " + now.strftime("%m/%d/%Y, %H:%M:%S") + "...", end=" ")
        data = data["data"]  # get the data from the subscription
        for d in data:  # data can be more than one item, do some preprocessing
            def get(k, domain):
                return d[k] if k in d else domain

            d["domain"] = get("domain", get("areaServed", get("hasFarm", "undefined-domain")))
            d["timestamp_subscription"] = round(time.time() * 1000)  # time in ms
            producer.send(RAW_TOPIC + '.' + re.sub(r"[-:_]", "", d["domain"]), value=d)

    def log_request(self, code='-', size='-'):
        return

    def _set_response(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        self.wfile.write(bytes("", "utf-8"))

    def do_GET(self):
        self._set_response()

    def do_POST(self):
        self._set_response()
        content_length = int(self.headers['Content-Length'])  # Get the size of data
        post_data = self.rfile.read(content_length).decode('utf-8')  # Get the data itself
        # post_data = urllib.parse.unquote(post_data)
        post_data = post_data.replace("%3D", "=")
        # print(post_data)
        post_data = json.loads(post_data)  # get the subscription

        if self.path == '/v2/subscriptions':
            do_register_subscription(post_data)
        else:
            self.do_fiware2kafka(post_data)

        # print("Done at " + datetime.now().strftime("%m/%d/%Y, %H:%M:%S"))


def run(server_class=ThreadingHTTPServer, handler_class=S, port=FIWARE2KAFKA_PORT):
    # curl -iX POST \
    #     "http://${FIWARE2KAFKA_IP}:${FIWARE2KAFKA_PORT_EXT}/v2/subscriptions" \
    #     -H 'Content-Type: application/json' \
    #     -d '{
    #         "description": "fiware2kafka",
    #         "subject": { "entities": [{ "idPattern": ".*" } ] },
    #         "notification": { "http": { "url": "http://'${FIWARE2KAFKA_IP}':'${FIWARE2KAFKA_PORT_EXT}'/v2/notify" }, "attrsFormat" : "keyValues" }
    #     }'
    res = 400
    while res != 201:
        print("Trying to register subscription to FIWARE...", end=" ")
        res = do_register_subscription({
            "description": "fiware2kafka",
            "subject": { "entities": [{ "idPattern": ".*" } ] },
            "notification": { "http": { "url": f"http://{FIWARE2KAFKA_IP}:{FIWARE2KAFKA_PORT}/v2/notify" }, "attrsFormat" : "keyValues" }
        })
        print("current status code: " + str(res) + "...")
        time.sleep(1)
    
    server_address = ('0.0.0.0', port)
    httpd = server_class(server_address, handler_class)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass
    httpd.server_close()


run()
