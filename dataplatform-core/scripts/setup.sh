#!/bin/bash
set -exo
. ./scripts/loadEnv.sh
docker compose up --build &>logs/stack-$(date +%s).txt &
./wait-for-it.sh "${DRACO_IP}:${DRACO_PORT_EXT}" --timeout=480 -- echo "ETL is up"