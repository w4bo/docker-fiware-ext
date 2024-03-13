#!/bin/bash
set -exo
. ./scripts/loadEnv.sh
docker compose up --build --remove-orphans &>logs/docker-compose-$(date +%s).txt &
./wait-for-it.sh "${ORION_IP}:${ORION_PORT_EXT}" --timeout=480 -- echo "OCB is up"
./wait-for-it.sh "${DRACO_IP}:${DRACO_PORT_EXT}" --timeout=480 -- echo "ETL is up"
