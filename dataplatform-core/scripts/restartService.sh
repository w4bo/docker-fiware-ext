#!/bin/bash
set -exo
docker compose stop $@
docker compose rm --force $@
docker compose up --detach --build $@
