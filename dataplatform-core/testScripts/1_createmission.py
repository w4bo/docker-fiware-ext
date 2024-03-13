import paho.mqtt.client as mqttClient
import requests
import time
from datetime import datetime
from dotenv import dotenv_values
from json import loads
from pymongo import MongoClient
from time import sleep

conf = dotenv_values("../.env")
orion_url = "http://{}:{}/v2/".format(conf["ORION_IP"], conf["ORION_PORT_EXT"])
options = "&options=keyValues&limit=1000"
url_farm = orion_url + "entities?type=AgriFarm" + options
url_therm = orion_url + "entities?q=createdBy==MQTT" + options
url_agrirobot = orion_url + "entities?type=AgriRobot" + options


def wait_for(description, url, attr_dom_name="foo", domain="bar", check_domain=True):
    print(description + url, end="")
    response_body = []
    i = 0
    while i < 50 and len(response_body) == 0:
        if i > 0:
            sleep(1)
        response = requests.get(url)
        assert (response.status_code == 200)
        response_body = [x for x in loads(response.text) if not check_domain or (attr_dom_name in x and x[attr_dom_name] == domain)]
        i += 1
    assert (len(response_body) > 0)
    response_body = [x for x in response_body if "test" not in x["id"]]
    print(". Found " + response_body[0]["id"])
    return response_body[0]


domain = wait_for("Looking for farm at: ", url_farm, check_domain=False)["id"]
thermometer = wait_for("Looking for MQTT Thermometer at: ", url_therm, attr_dom_name="areaServed", domain=domain)
thermometer_id = thermometer["id"]
assert (len(thermometer_id) > 0)
assert (thermometer["location"]["coordinates"][0] >= -180)  # longitude
assert (thermometer["location"]["coordinates"][1] >= -90)  # latitude
assert (thermometer["status"])
assert (len(thermometer["controlledProperty"]) > 0)
assert (len(thermometer["value"]) > 0)
assert (int(thermometer["value"][0]) > 0)
wait_for("Looking for AgriRobot: ", url_agrirobot, attr_dom_name="hasFarm", domain=domain)
wait_for("Wait for carob: ", orion_url + "entities?id=carob-python&options=keyValues&limit=1000", attr_dom_name="hasFarm", domain=domain)

###############################################################################
# Testing MQTT
###############################################################################
received = False  # global variable for message reception


def on_connect(client, userdata, flags, rc):
    if rc == 0:
        print("OK: Connected to the MQTT broker")
    else:
        print("FAIL: Connection to the MQTT broker failed")


def on_message(client, userdata, message):
    global received
    received = True


client = mqttClient.Client("python-mqtt-client")  # create new instance
client.username_pw_set(conf["MOSQUITTO_USER"], password=conf["MOSQUITTO_PWD"])
client.on_connect = on_connect
client.on_message = on_message
client.connect(conf["MOSQUITTO_IP"], port=int(conf["MOSQUITTO_PORT_EXT"]))  # connect to broker
client.loop_start()  # start the loop
topic = "/" + conf["FIWARE_API_KEY"] + "/#"  # "/" + thermometer_id + "/attrs"
print("Listening to: " + topic)
client.subscribe(topic)
i = 0
while i < 50 and not received:
    time.sleep(1)
    i += 1
client.disconnect()
client.loop_stop()
assert received, "No MQTT message received"

###############################################################################
# Check subscriptions
###############################################################################
response = requests.get(orion_url + "subscriptions")
responses = loads(response.text)
i = 0
for response_body in responses:
    assert (response.status_code == 200), str(response_body)
    assert (response_body["status"] == "active"), str(response_body)
    if "notification" in response_body and "timeSent" in response_body["notification"]:
        assert (response_body["notification"]["timesSent"] > 0), str(response_body)
        assert (response_body["notification"]["lastSuccessCode"] == 200), str(response_body)
        i += 1
assert i >= 0  # at least one notification should have the timeSent
print("OK: Subscription found")

###############################################################################
# Check mongodb persistence
###############################################################################
MONGO_IP = conf["MONGO_DB_PERS_IP"]
MONGO_PORT = conf["MONGO_DB_PERS_PORT_EXT"]
MONGO_CONNECTION_STR = "mongodb://{}:{}".format(MONGO_IP, MONGO_PORT)
client = MongoClient(MONGO_CONNECTION_STR)  # connect to mongo
count1 = 0
i = 0
while i < 50 and count1 == 0:
    time.sleep(1)
    count1 = len(list(client[conf["MONGO_DB_PERS_DB"]][domain].find()))
    i += 1
assert count1 > 0, "No document found"

###############################################################################
# Test the node APIs
###############################################################################
NODE_URL = "http://{}:{}/api/".format(conf["WEB_SERVER_IP"], conf["WEB_SERVER_PORT_EXT"])
for url in ['download/{}/{}/{}/{}/{}/{}'.format(domain, 'AgriFarm', 0, round(time.time() * 1000), 0, 1000000),
            'entitytypes/{}'.format(domain),
            'entities/{}'.format(domain),
            'entity/{}/{}'.format(domain, domain)]:
    response = requests.get(NODE_URL + url)
    response_body = loads(response.text)
    assert (response.status_code == 200), url
    assert (len(response_body) > 0), url
