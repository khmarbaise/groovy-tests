import org.codehaus.mojo.unix.rpm.RpmUtil
import org.codehaus.mojo.unix.rpm.RpmUtil.FileInfo
import org.codehaus.mojo.unix.rpm.RpmUtil.SpecFile

def rpmFile = new File(".", "cienv-tools.x86_64.rpm");

def fileInfos = RpmUtil.queryPackageForFileInfo(rpmFile)

fileInfos.each {
  item -> println item;
}


