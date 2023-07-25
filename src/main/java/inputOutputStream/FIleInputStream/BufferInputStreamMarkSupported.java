package inputOutputStream.FIleInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamMarkSupported {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/FIleInputStream/input.txt");
        BufferedInputStream bs = new BufferedInputStream(fis);

        System.out.println("File is " + fis.markSupported());
        System.out.println("buffer is " + bs.markSupported());

        System.out.println(bs.available());

        System.out.print((char)bs.read());
        System.out.println((char)bs.read());
        bs.mark(2);
        System.out.print((char)bs.read());
        System.out.println((char)bs.read());

        bs.reset();
        System.out.print((char)bs.read());
        System.out.println((char)bs.read());

        bs.close();
    }
}
