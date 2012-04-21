#!/bin/bash
CLASSPATH=~/.m2/repository/org/codehaus/mojo/unix/unix-rpm/1.0-alpha-1/unix-rpm-1.0-alpha-1.jar:~/.m2/repository/org/codehaus/mojo/unix/unix-common/1.0-alpha-1/unix-common-1.0-alpha-1.jar
#groovy -cp $CLASSPATH firstRPM.groovy
groovy -cp $CLASSPATH first.groovy
