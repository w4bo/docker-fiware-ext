#!/bin/bash
set -exo
. ./scripts/loadEnv.sh
./stop.sh
docker compose -f docker-compose.base.yml --env-file .env up --build &>logs/docker-base-$(date +%s).txt &
./wait-for-it.sh ${KAFKA_IP}:${KAFKA_PORT_EXT} --timeout=480 -- echo "Kafka is up"
cd testScripts
if [ -d venv/bin/ ]; then
    source venv/bin/activate
else 
    source venv/Scripts/activate
fi
cd -
python testScripts/waitforkafka.py
