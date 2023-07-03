package inputOutputStream.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// compile like --> javac FileCopyDynamically.java
// run like --> java FileCopyDynamically input.txt output.txt
public class FileCopyDynamically {
    public static void main(String arg[]) throws IOException {
        FileInputStream fis = new FileInputStream(arg[0]);
        FileOutputStream fos = new FileOutputStream(arg[1]);

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
