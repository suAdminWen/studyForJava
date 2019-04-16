import java.io.File;

public class FilenameFilter {
    public String[] getFilenames (){
        File dir = new File("./src");
        // System.out.println(dir.list());
        // String[] filelist = dir.list(new java.io.FilenameFilter() {
        //     @Override
        //     public boolean accept(File f, String s) {
        //         return s.endsWith(".java");
        //     }
        // });
        // lambda
        String[] fileLists = dir.list((f, s) -> s.endsWith(".java"));
        return fileLists;
    }
}
