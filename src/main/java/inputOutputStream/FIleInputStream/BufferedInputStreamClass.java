package inputOutputStream.FIleInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/FIleInputStream/input.txt");
        BufferedInputStream bs = new BufferedInputStream(fis);

        System.out.println(bs.available());
        int data;
        while((data = bs.read()) != -1){
            System.out.print((char)data);
        }
        bs.close();
    }
}
