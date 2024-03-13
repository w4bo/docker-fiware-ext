# WeLASER

[![Build](https://github.com/w4bo/welaser/actions/workflows/build.yml/badge.svg)](https://github.com/w4bo/welaser/actions/workflows/build.yml)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=w4bo_welaser&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=w4bo_welaser)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=w4bo_welaser&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=w4bo_welaser)

## Set up

Refer to this [Github action](https://github.com/w4bo/welaser/blob/master/.github/workflows/build.yml) for the complete setup.
This project requires Java 11,  Python 3.8, docker, and docker compose installed.

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

### (Optional) Mosquitto MQTT

To create a user and a password

```sh
docker run -v $(pwd)/mosquitto:/mosquitto -it eclipse-mosquitto sh
```

and from within the container

```sh
cd mosquitto
mosquitto_passwd -c pwfile <user>
```

Where `<user>` and `<pwd>` corresponds to `MOSQUITTO_USER` and `MOSQUITTO_PWD` variables defined in `.env`

Register a subscriber

```sh
docker run -it --rm efrecon/mqtt-client sub -h ${MOSQUITTO_IP} -p ${MOSQUITTO_PORT_EXT} -t "foo" -u ${MOSQUITTO_USER} -P ${MOSQUITTO_PWD}
```

Publish some messages

```sh
docker run -it --rm efrecon/mqtt-client pub -h ${MOSQUITTO_IP} -p ${MOSQUITTO_PORT_EXT} -t "foo" -m "bar" -u ${MOSQUITTO_USER} -P ${MOSQUITTO_PWD}
```

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
