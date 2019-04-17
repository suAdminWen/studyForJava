package t2;

import java.io.File;

public class FilenameFilter {
    public String[] getFilenames (){
        File dir = new File("./src");
        // lambda
        String[] fileLists = dir.list((f, s) -> s.endsWith(".java"));
        return fileLists;
    }
}
