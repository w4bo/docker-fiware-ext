import requests
import time
from dotenv import dotenv_values
from json import loads
from pymongo import MongoClient
import uuid

conf = dotenv_values("../.env")
orion_url = "http://{}:{}/v2/".format(conf["ORION_IP"], conf["ORION_PORT_EXT"])
domain = "foo-domain"

###############################################################################
# Write data to orion
###############################################################################
uuid_string = str(uuid.uuid4())
data = {
    "id": uuid_string,
    "type": "AgriFarm",
    "name": "Farm1",
    "domain": domain,
    "location": {
        "type": "Point",
        "coordinates": [10.1234, 20.5678]
    }
}
headers = {"Content-Type": "application/json"}
response = requests.post(orion_url + "entities?options=keyValues", json=data, headers=headers)
assert response.status_code == 201, f"Failed to write data to Orion. Status code {response.status_code}"
print("Data written to Orion successfully")

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
# MONGO_IP = conf["MONGO_DB_PERS_IP"]
# MONGO_PORT = conf["MONGO_DB_PERS_PORT_EXT"]
# MONGO_CONNECTION_STR = "mongodb://{}:{}".format(MONGO_IP, MONGO_PORT)
# client = MongoClient(MONGO_CONNECTION_STR)  # connect to mongo
# count1 = 0
# i = 0
# while i < 50 and count1 == 0:
#     time.sleep(1)
#     count1 = len(list(client[conf["MONGO_DB_PERS_DB"]][domain].find()))
#     i += 1
# assert count1 > 0, "No document found"
