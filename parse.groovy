import java.io.*
import java.util.*

def getProjectVersion() {
   def pom = new XmlSlurper().parse(new File('src/main/resources/pom.xml'))

   def allDependencies = pom.dependencies;

   def dependencies = allDependencies.dependency
   
   def appassemblerModule = dependencies.find {
       item -> item.groupId.equals("org.codehaus.mojo.appassembler") && item.artifactId.equals("appassembler-model");
   }
   
   return appassemblerModule.version;
}           

println "Version:" +getProjectVersion()

