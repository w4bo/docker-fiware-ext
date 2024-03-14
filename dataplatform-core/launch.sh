#!/bin/bash
set -exo

. ./scripts/loadEnv.sh
./stop.sh
run_simulation=0
run_tests=0
while getopts "cst" opt
do
    case $opt in
    (t) run_tests=1 ;;
    (*) printf "Illegal option '-%s'\n" "$opt" && exit 1 ;;
    esac
done

./scripts/createVenv.sh
./scripts/setupBase.sh
./scripts/setup.sh

curl -iX POST \
    "http://${FIWARE2KAFKA_IP}:${FIWARE2KAFKA_PORT_EXT}/v2/subscriptions" \
    -H 'Content-Type: application/json' \
    -d '{
  "description": "fiware2kafka",
  "subject": { "entities": [{ "idPattern": ".*" } ] },
  "notification": { "http": { "url": "http://'${FIWARE2KAFKA_IP}':'${FIWARE2KAFKA_PORT_EXT}'/v2/notify" }, "attrsFormat" : "keyValues" }
}'

kafka2mongo/gradlew -p kafka2mongo --stacktrace --scan

((run_tests)) && scripts/runTests.sh
