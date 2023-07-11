package inputOutputStream.ReaderClass;

import java.io.*;

class ReaderClass {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/ReaderClass/input.txt");

        char array[] = new char[100];
        System.out.println(fr.ready());
        fr.read(array);

        System.out.println(String.valueOf(array));
        fr.close();
    }
}
