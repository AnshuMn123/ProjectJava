package inputOutputStream.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// if will copy data from abc --> bbc
public class FileCopy {
    public static void main(String arg[]) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/input.txt");
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/file.txt");

        int data;
        while ((data = fis.read()) != -1){
            fos.write(data);
        }

        fis.close();
        fos.close();
    }

}
