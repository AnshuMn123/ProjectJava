package inputOutputStream.randomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess2 {
    public static void main (String[] args) throws IOException {
            long l = 458754545576l;
            double d = 1.5;
            float f = 14.56f;
            int i = 1;
            boolean bol = true;
            short s = 15;

            RandomAccessFile rf = new RandomAccessFile("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/randomAccess/file2.txt", "rw");
            rf.writeUTF("Hello");

            rf.seek(0);
            System.out.println("writeUTF : " + rf.readUTF());

            rf.seek(0);
            byte[] b = {1, 2, 3, 6, 5, 4};
            rf.write(b);

            rf.seek(0);
            System.out.println("Use of .read(byte[] b) : " + rf.read(b));

            rf.write(i);

            rf.seek(0);
            System.out.println("write(int i) : " + rf.read(b));
            rf.writeBoolean(bol);

            rf.seek(0);
            System.out.println("writeBoolean() : " + rf.readBoolean());

            rf.write(b, 2, 2);
            rf.seek(0);
            System.out.println("write(byte[] b, int offset, int len) : " + rf.readByte());

            rf.writeChar('c');
            rf.seek(0);
            System.out.println("writeChar() : " + rf.readChar());

            rf.seek(0);
            rf.writeDouble(d);

            rf.seek(0);
            System.out.println("writeDouble() : " + rf.readDouble());
            rf.seek(0);

            rf.writeFloat(f);
            rf.seek(0);
            System.out.println("writeFloat() : " + rf.readFloat());

            rf.writeLong(l);
            rf.seek(0);
            System.out.println("writeLong() : " + rf.readLong());

            rf.writeShort(s);

            rf.seek(0);
            System.out.println("writeShort() : " + rf.readShort());
    }
}



