#!/bin/bash

docker compose down --remove-orphans
docker compose -f docker-compose.base.yml --env-file .env down --remove-orphans
rm -f logs/*.txt
