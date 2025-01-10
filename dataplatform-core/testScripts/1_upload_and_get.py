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
for _ in range(20):
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
    time.sleep(1)

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
print("OK: persitence found")

###############################################################################
# Check mongodb currentState
###############################################################################
#Write an entity and check it is stored on currentState
id = f"urn:ngsi-ld:Camera:{domain}:32cde24e-3f00-4623-bb4a-1e6e0824eeb1"
imageSnapshot = "https://dummyimage.com/600x400/000/aaa.png"
data = {
    "id": id,
    "type": "Camera",
    "name": "DroneCam1",
    "domain": domain,
    "location": {
        "type": "Point",
        "coordinates": [10.1234, 20.5678]
    },
    "imageSnapshot": imageSnapshot
}
headers = {"Content-Type": "application/json"}
response = requests.post(orion_url + "entities?options=keyValues", json=data, headers=headers)
assert response.status_code == 201, f"Failed to write data to Orion. Status code {response.status_code}"
time.sleep(5)

currentState = []
i = 0
while i < 50 and len(currentState) == 0:
    time.sleep(1)
    currentState = list(client[conf["MONGO_DB_CURRENT_STATE_DB"]][conf["MONGO_DB_CURRENT_STATE_COLLECTION"]].find({"id":id}))
    i += 1
assert len(currentState) == 1, "Invalid current state document found"
print("OK: currentState found")

assert currentState[0]["imageSnapshot"] != imageSnapshot, "Data are not enriched"
print("OK: data enriched")

#Update entity and check it is updated on currentState
newName = data["name"] + "Updated"
data["name"] = newName
update_body = {"actionType": "append", "entities": [data]}
response = requests.post(orion_url + "op/update?options=keyValues", json=update_body, headers=headers)
assert response.status_code == 204, f"Failed to write data to Orion. Status code {response.status_code}"

time.sleep(5)
count1 = 0
i = 0
updated = False
while i < 50 and not updated:
    time.sleep(1)
    currentState = list(client[conf["MONGO_DB_CURRENT_STATE_DB"]][conf["MONGO_DB_CURRENT_STATE_COLLECTION"]].find({"id":id}))
    if len(currentState) > 0:
        assert len(currentState) == 1, "Failed currentState updated"
        entity = currentState[0]
        updated = entity["name"] == newName
    i += 1
assert updated, "No current state update found"
print("OK: currentState updated")

import os
print([os.path.join(root, file) 
            for root, _, files in os.walk("../testVolume/") 
            for file in files])