package inputOutputStream.outputStream.fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String arg[]) throws IOException {
        FileOutputStream file =
                new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/outputStream/input.txt");

        file.write(15); // for reading first byte from files

//        System.out.println(datSa);
        file.close(); // close the connection between file and java file.

        FileInputStream file1 =
                new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/outputStream/input.txt");

        int data = file1.read(); // for reading first byte from files
        System.out.println(data);
        file.close(); // close the connection between file and java file.
    }
}
