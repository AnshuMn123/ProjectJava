package inputOutputStream.fileHandling;

import java.io.File;
import java.util.Arrays;

public class FileHandling {
    public static void main (String[] args) {
        File f = new File("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/randomAccess");

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        System.out.println(Arrays.toString(f.list()));

        // or can do in for loop also
        for(String x : f.list()){
            System.out.println(x);
        }

        for(File x: f.listFiles()){
            System.out.print(x.getName() + " ");
            System.out.println(f.getPath());
        }
    }
}
