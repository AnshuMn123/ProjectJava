package inputOutputStream.randomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess1 {
    public static void main (String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/randomAccess/file1.txt", "rw");
        rf.writeUTF("Hello");

        rf.seek(0);
        System.out.println("Use of readUTF() : " + rf.readUTF());

        rf.seek(0);
        System.out.println("1 readLine() : " + rf.readLine());

        rf.seek(0);
        rf.writeUTF("Hello \nGeeks For Geeks");

        rf.seek(0);
        System.out.println("2 readLine() : " + rf.readLine());

        rf.seek(3);
        System.out.println("Use of readUnsignedByte() : " + rf.readUnsignedByte());

        rf.seek(4);
        System.out.println("Use of readUnsignedByte() : " + rf.readUnsignedShort());

        rf.setLength(78);
        System.out.println("Use of setLength() : " + rf.length());

        rf.seek(2);
        System.out.println("Use of skipBytes() : " + rf.skipBytes(3));

        rf.close();
    }
}

