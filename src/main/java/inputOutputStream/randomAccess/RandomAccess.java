package inputOutputStream.randomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main (String[] args) throws IOException {
            double d = 1.5;
            float f = 14.56f;

            RandomAccessFile rf = new RandomAccessFile("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/randomAccess/file.txt", "rw");
            rf.writeUTF("Hello");
            rf.seek(0);

            System.out.println("Use of read() method : " + rf.read());

            rf.seek(0);
            byte[] b = {1, 2, 3};
            System.out.println("Use of .read(byte[] b) : " + rf.read(b));

            System.out.println("Use of readBoolean() : " + rf.readBoolean());

            System.out.println("Use of readByte() : " + rf.readByte());

            rf.writeChar('c');
            rf.seek(0);
            System.out.println("Use of readChar() : " + rf.readChar());

            rf.seek(0);
            rf.writeDouble(d);

            rf.seek(0);
            System.out.println("Use of readDouble() : " + rf.readDouble());

            rf.seek(0);
            rf.writeFloat(f);

            rf.seek(0);
            System.out.println("Use of readFloat() : " + rf.readFloat());

            rf.seek(0);
            byte[] arr = new byte[(int) rf.length()];
            rf.readFully(arr);

            String str1 = new String(arr);
            System.out.println("Use of readFully() : " + str1);

            rf.seek(0);
            rf.readFully(arr, 0, 8);

            String str2 = new String(arr);
            System.out.println("Use of readFully(byte[] b, int off, int len) : " + str2);
    }
}
