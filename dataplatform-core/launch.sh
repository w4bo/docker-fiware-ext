#!/bin/bash
set -exo

. ./scripts/loadEnv.sh
./stop.sh
run_simulation=0
run_tests=0
while getopts "cst" opt
do
    case $opt in
    (c) sudo find mounts/mongodb ! -name '.dummy' -type f -exec rm -f {} + ;;
    (s) run_simulation=1 ;;
    (t) run_tests=1 ;;
    (*) printf "Illegal option '-%s'\n" "$opt" && exit 1 ;;
    esac
done
./scripts/createVenv.sh
./scripts/setupKafka.sh
./scripts/setupFiware.sh

curl -iX POST \
    "http://${DRACO_IP}:${DRACO_PORT_EXT}/v2/subscriptions" \
    -H 'Content-Type: application/json' \
    -d '{
  "description": "ETL",
  "subject": { "entities": [{ "idPattern": ".*" } ] },
  "notification": { "http": { "url": "http://'${DRACO_IP}':'${DRACO_PORT_EXT}'/v2/notify" }, "attrsFormat" : "keyValues" }
}'

curl -iX POST \
    "http://${DRACO_IP}:${DRACO_PORT_EXT}/v2/subscriptions" \
    -H 'Content-Type: application/json' \
    -d '{
  "description": "IoTAgent",
  "subject": { "entities": [{ "idPattern": ".*" }], "condition": { "attrs": [ "cmd" ] }},
  "notification": { "http": { "url": "http://'${IOTA_IP}':'${IOTA_PORT_EXT}'/" }, "attrsFormat" : "keyValues", "attrs" : ["cmd"] }
}'

devices/gradlew -p devices --stacktrace --scan

((run_simulation)) && devices/gradlew runMission -p devices --stacktrace --scan &>logs/mission-$(date +%s)-devices.txt &
((run_tests)) && scripts/runTests.sh
