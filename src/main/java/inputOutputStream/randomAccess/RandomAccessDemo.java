package inputOutputStream.randomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main (String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/randomAccess/fileDemo.txt", "rw");

        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
        System.out.println((char) rf.read());
        rf.write('d');
        System.out.println((char) rf.read());
        rf.skipBytes(3);
        System.out.println((char) rf.read());
        rf.seek(3);
        System.out.println((char) rf.read());

        System.out.println(rf.getFilePointer());

        rf.seek(rf.getFilePointer() + 2);

        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
    }
}
