#!/bin/bash
set -exo
. ./scripts/loadEnv.sh
docker compose up --build &>logs/stack-$(date +%s).txt &
./wait-for-it.sh "${FIWARE2KAFKA_IP}:${FIWARE2KAFKA_PORT_EXT}" --timeout=480 -- echo "fiware2kafka is up"