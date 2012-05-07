#!/usr/bin/env groovy
import java.io.*
import java.util.*

def (a, b) = [true, false]

def result = [a:true, b:false]

println "a:" + result['a'] + " b:" + result['b']


def check(fileInfos) {
  def result = [activation:false, mail:false]

  fileInfos.each {
    fileInfo -> if (fileInfo.path.endsWith("..")) {
      result[activation] = true
    } else if (fileInfo.path.endsWith("..")) {
      result[mail] = true
    }
  }
  return result
}
