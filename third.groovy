#!/usr/bin/env groovy
println "This is the groovy script."

def st = /a\b\c\d/ + /Test/

println st

def contents = /This is more like a test/

def fields = [
  /First Entry/,
  /Second Entry/,
  /Third Entry/,
  /set CLASSPATH="%BASEDIR%"\etc;"%REPO%"\org\codehaus\mojo\appassembler-maven-plugin\it\basic-test\1.0-SNAPSHOT\basic-test-1.0-SNAPSHOT.jar/,
  /set EXTRA_JVM_ARGUMENTS=-Xms16m/,
  /This is with $contents MORE TEXT/
]

fields.each { item -> println item }

def simpleString = "This is a Test";

if (simpleString.startsWith(/This is a/)) {
  println "This is true"
}

