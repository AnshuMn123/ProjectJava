package inputOutputStream.outputStream;

import java.io.*;

public class BufferedOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/outputStream/input.txt");
        BufferedOutputStream bs = new BufferedOutputStream(fis);

        String s="Welcome.";
        bs.write(s.getBytes());
        bs.flush();
        bs.close();
    }
}
