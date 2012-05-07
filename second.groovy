#!/usr/bin/env groovy
println "This is the groovy script."

1.upto(5) {
  i -> println "i:" +i
}

(1..5).each {
  i -> println "k:" + i
}
println 2**31
println 2**64

def thisIsAList = [
  1, 2, 1, 3, 4, 5, 3
]

def thisIsAUniqueList = thisIsAList.unique();

thisIsAUniqueList.each {
  item -> println "Unique List:" + item
}

assert thisIsAList.size() == 7
