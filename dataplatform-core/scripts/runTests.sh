#!/bin/bash
set -exo

cd testScripts
source venv/bin/activate
# for FILE in *.py; do echo "$FILE"; python "$FILE"; done
# for FILE in *.sh; do echo "$FILE"; source "./$FILE"; done
for FILE in *; do
  if [[ "$FILE" =~ .*".py".* ]]
  then
	  sudo python "$FILE"
  elif [[ "$FILE" =~ .*".sh".* ]]
  then
	  source "./$FILE"
  fi
done
cd -
