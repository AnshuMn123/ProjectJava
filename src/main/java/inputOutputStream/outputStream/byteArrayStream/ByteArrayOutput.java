package inputOutputStream.outputStream.byteArrayStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutput {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte []b = bos.toByteArray();
        for(byte x : b){
            System.out.println((char) x);
        }

        // or
        // we can directly write to any file also
        bos.writeTo(new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/outputStream/byteArrayStream/file1.txt"));
        bos.close();
    }
}
