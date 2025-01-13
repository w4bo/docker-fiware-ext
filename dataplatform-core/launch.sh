#!/bin/bash
set -exo

. ./scripts/loadEnv.sh
./stop.sh

run_simulation=0
run_tests=0
while getopts "cst" opt
do
    case $opt in
    (t) run_tests=1 ;;
    (*) printf "Illegal option '-%s'\n" "$opt" && exit 1 ;;
    esac
done

./scripts/createVenv.sh
./scripts/setupBase.sh
./scripts/setup.sh

kafka2mongo/gradlew -p kafka2mongo --stacktrace --scan
persistImages/gradlew -p persistImages --stacktrace --scan

((run_tests)) && scripts/runTests.sh
