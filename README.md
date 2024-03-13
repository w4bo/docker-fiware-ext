# WeLASER

## Set up

Refer to `.github/workflows/build.yml` for the complete setup.
This project requires Java 11, Python 3.11, docker, and docker compose installed.

```sh
sudo apt install git openjdk-11-jre-headless -y
sudo add-apt-repository ppa:deadsnakes/ppa
sudo apt install python3.8 python3.8-dev python3.8-venv -y
sudo ln -s /usr/bin/python3.8 /usr/bin/python
```

Check the instructions to install docker and the compose plugin here:
- https://docs.docker.com/engine/install/ubuntu/
- https://docs.docker.com/compose/install/linux/

The user executing the WeLASER architecture should be in the `docker` group:

```sh
sudo groupadd docker
sudo usermod -aG docker $USER
```

Then, to do the mandatory configuration, run:

```sh
scripts/submodule.sh
scripts/config.sh
```

Note that this will replace the content of the `.env` file with `.env.example`. 
Check the variables from the `.env` and `webserver/public/env.js` files and change IPs (if needed).
If existing, `scripts/config.sh` also runs `scripts/updatePwd.sh` to automatically replace strings (e.g., password) that **must not** be stored into the `.env.example` file.

## Starting the architecture

Execute all the containers

```sh
./launch.sh # launch the ecosystem (production mode)
./launch.sh -s # also simulate a mission
./launch.sh -st # ... and run the tests
```

Note: **in production mode, execute `./launch.sh` without any flag!**

Shut down the environment

```sh
./stop.sh
``` 

To re-build and restart a single container

```sh
scripts/restartService.sh containername
```

Where `containername` is picked from the `docker-compose.yml` file.
