package inputOutputStream.copyingDataInDifferentFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/copyingDataInDifferentFiles/file1.txt");

        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/copyingDataInDifferentFiles/file2.txt");

        int x;
        while((x = fis.read()) != -1){
            if(x >= 65 && x <= 90){
                fos.write(x + 32);
            }else {
                fos.write(x);
            }
        }

        fis.close();
        fos.close();
    }
}
