package inputOutputStream.inputStream.fIleInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FISdynamically {
    public static void main(String arg[]) throws IOException {
        FileInputStream file =
                new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/inputStream/fIleInputStream/file.txt");

        int data;
        while((data = file.read()) != -1) { // for reading first byte from files
            System.out.println((char)data);
        }
        file.close(); // close the connection between file and java file.
    }
}
