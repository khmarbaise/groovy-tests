#!/usr/bin/env groovy
println "This is the groovy script."

def projectVersion = "1.6-SNAPSHOT"
def filesInRepository = [
 "junit/junit/3.8.1/junit.jar",
 'net/java/dev/stax-utils/stax-utils/20060502/stax-utils.jar',
 'org/codehaus/mojo/appassembler-maven-plugin/it/mappasm-71-5/1.0-SNAPSHOT/mappasm-71-5.jar',
 'org/codehaus/plexus/plexus-utils/1.1/plexus-utils.jar',
 'stax/stax/1.1.1-dev/stax.jar',
 'stax/stax-api/1.0.1/stax-api.jar',
 "org/codehaus/mojo/appassembler/appassembler-booter/1.6-SNAPSHOT/appassembler-booter.jar",
 "org/codehaus/mojo/appassembler/appassembler-model/" + projectVersion + "/appassembler-model.jar"
]


def classpathElements = []
def configuration = new XmlSlurper().parse(new File("app.xml"))
def classpath = configuration.classpath
def allDependencies = classpath.dependencies
def dependencies = allDependencies.dependency
dependencies.each {
    dependency ->
        def relativePath = dependency.relativePath
        classpathElements.add( relativePath.text() );
}

// TODO: For debugging purposes only, remove before release
println "     classpathElements"
classpathElements.each {
    classpathElement ->
        println "     - classpathElement: '" + classpathElement + "'"
}

filesInRepository.each {
    classpathElement -> print "Checking for '" + classpathElement + "' in classpath..."
    if (!classpathElements.contains(classpathElement)) {
        println ""
        println "The classpath contains the following: " + classpathElements
        throw new FileNotFoundException("We couldn't find '" + classpathElement + "' in classpath (booter).");
    }
    println " done."
}

