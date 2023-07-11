package inputOutputStream.FIleInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS {
    public static void main(String arg[]) throws IOException {
        FileInputStream file =
                new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/FIleInputStream/input.txt");

        int cnt = file.available();
        System.out.println(cnt);

        byte[] content = new byte[100]; // creating byte array to store data
        file.read(content); // storing data to byte array

        String fileContent = new String(content); // converting byte array to string
        System.out.println(fileContent);



        int data = file.read(); // for reading first byte from files
        System.out.println(data);
        file.close(); // close the connection between file and java file.
    }
}
