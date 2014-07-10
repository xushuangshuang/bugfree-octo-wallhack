#!/bin/sh

java  -classpath "lib-test/xushuangshuangJunit-4.jar;target/classes;target/classes-test;lib-test/guava-15.0.jar;lib-test/javassist-3.18.2-GA.jar;lib-test/reflections-0.9.9-RC2.jar" com.unit.XuShuangShuangJunit com.baldur

echo "RUN TEST DONE"
