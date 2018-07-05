#!/bin/bash
find src -name '*.java' > sources.txt
mkdir -p classes
javac @sources.txt -d classes && java -cp classes:resources Alcohol
