#!/bin/bash

echo "Cleaning with Maven"
mvn clean
echo "Compiling with Maven"
mvn compile
echo "Assembling with Maven"
mvn assembly:single
echo "Done, you should find your built file in the root of the /target directory."
# the single line for doing this is:
# mvn clean compile assembly:single