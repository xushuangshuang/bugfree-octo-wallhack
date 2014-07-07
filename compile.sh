#!/bin/sh

set -e

mkdir target/classes

mkdir target/classes-test

javac -d target/classes src/main/java/com/baldur/google/*.java

javac -classpath "lib-test/xushuangshuangJunit-1.jar;target/classes" -d target/classes-test src/test/java/com/baldur/*.java
