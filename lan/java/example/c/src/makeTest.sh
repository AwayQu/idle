#!/usr/bin/env bash
rm *.java
rm *.class
jflex c.flex
java -jar ../../dist/java-cup-11b.jar -locations -interface -parser Parser -xmlactions c.cup
javac -cp ../../dist/java-cup-11b-runtime.jar:. *.java
java -cp ../../dist/java-cup-11b-runtime.jar:. Parser input.c simple.xml
java -cp ../../dist/java-cup-11b-runtime.jar:. Parser complicated.c complicated.xml