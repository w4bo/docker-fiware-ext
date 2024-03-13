#!/bin/bash

docker compose down --remove-orphans
docker compose -f kafka-docker/docker compose.yml --env-file .env down --remove-orphans
rm -f logs/*.txt
