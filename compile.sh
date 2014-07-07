#!/bin/sh

set -e

mkdir -p target/classes

mkdir -p target/classes-test

javac -d target/classes src/main/java/com/baldur/google/*.java

javac  -d target/classes-test  -classpath "target/classes;lib-test/xushuangshuangJunit-1.jar" src/test/java/com/baldur/*.java

echo "COMPILE  SUCCESS"
