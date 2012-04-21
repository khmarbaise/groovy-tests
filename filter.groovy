
def currentFolder = new File(".").getCanonicalPath() + "/";

println "Current Folder:" + currentFolder

def theFolder = "/home/kama/ws-git/maui/target/it/"
def logFileInput = new File("build-download.log")

new File("build-download-result.log").withWriter { out ->
    logFileInput.eachLine { line ->

        if (line.contains(theFolder)) {
            line = line.replace(theFolder, "/home/maui/");
        }
       
        if (!line.startsWith("Download") && !line.startsWith(" wagon http use")) {
            out.println line;
        }
    }
}

