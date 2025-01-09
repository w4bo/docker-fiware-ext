#!/bin/bash
set -exo

DEFIP=$(hostname -I | cut -d' ' -f1)
IP=${1:-$DEFIP}

find . -type d \( -name mongodb -o -name portainer \) -prune -o -type f -iname "*.sh" -exec chmod +x {} \;
find . -type d \( -name mongodb -o -name portainer \) -prune -o -name \.env -type f -exec rm {} \;

#for file in env.example env.base.example; do
#    $f="${file%.*}"
#    cp "$file" "$f"
f=".env"
cp .env.example $f
sed -i "s/127.0.0.1/$IP/g" "$f"
sed -i 's+/path/to/code/here+'$(pwd)'+g' "$f"
#done

. scripts/loadEnv.sh

# Copy the .env file where needed
ln .env kafka2mongo/.env
ln .env persistImages/.env