package inputOutputStream.CopyingDataInDifferentFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/CopyingDataInDifferentFiles/file1.txt");
        FileInputStream fis2 = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/CopyingDataInDifferentFiles/file2.txt");

        FileOutputStream dest = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/CopyingDataInDifferentFiles/dest.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int x;
        while((x = sis.read()) != -1){
            dest.write(x);
        }

        sis.close();
        fis1.close();
        fis2.close();
        dest.close();
    }
}
