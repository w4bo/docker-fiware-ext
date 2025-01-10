import requests
import time
from dotenv import dotenv_values
import os
import subprocess
import uuid

conf = dotenv_values("../.env")
orion_url = "http://{}:{}/v2/".format(conf["ORION_IP"], conf["ORION_PORT_EXT"])
domain = "foo-domain"

# Clean image archive folder from previous tests
image_archive_path = "../testVolume/"

if os.path.exists(image_archive_path):
    subprocess.run(["sudo", "rm", "-rf", image_archive_path + "*"], check=True)

###############################################################################
# Check persistence of images linked in entities
###############################################################################

id = f"urn:ngsi-ld:Camera:{domain}:12cde24e-3e00-4b23-b99a-5e6e2224eeb1"
imageSnapshot = "https://dummyimage.com/600x400/000/999.jpg"
data = {
    "id": id,
    "type": "Camera",
    "name": "DroneCam",
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
time.sleep(10)

countFiles = 0
i = 0
while i < 50 and countFiles == 0:
    time.sleep(1)
    countFiles = len([file for _, _, files in os.walk(image_archive_path) for file in files if file.lower().endswith('.jpg')])
    i += 1

print([os.path.join(root, file) 
            for root, _, files in os.walk(image_archive_path) 
            for file in files])
assert countFiles > 0, "Image is not saved in archive"
print("OK: image saved successfully")