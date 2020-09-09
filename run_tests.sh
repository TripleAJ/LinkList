#!/bin/bash

# compile all of the test files
for x in $(ls -1 *.java); 
do 
    echo 'building ' $x
    javac-algs4 $x; done

# now run all of the class files
for x in $(ls -1 Test*.class | sed 's/.class//'); 
do 
    echo 'running' $x
    java-algs4 $x; 
done

