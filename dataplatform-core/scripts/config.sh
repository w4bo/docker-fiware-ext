#!/bin/bash
set -exo

DEFIP=$(hostname -I | cut -d' ' -f1)
IP=${1:-$DEFIP}

find . -type d \( -name mongodb -o -name portainer \) -prune -o -type f -iname "*.sh" -exec chmod +x {} \;
find . -type d \( -name mongodb -o -name portainer \) -prune -o -name \.env -type f -exec rm {} \;

cp .env.example .env
sed -i "s/127.0.0.1/$IP/g" .env
sed -i 's+/path/to/code/here+'$(pwd)'+g' .env
if [ -f "scripts/updatePwd.sh" ]; then
    . ./scripts/updatePwd.sh
fi
. scripts/loadEnv.sh

# Copy the .env file where needed
ln .env kafka2mongo/.env