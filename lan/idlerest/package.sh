#!/usr/bin/env bash

cd ../objectivec
mvn install -Dmaven.test.skip=true


cd ../idlerest
mvn package -Dmaven.test.skip=true