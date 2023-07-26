package inputOutputStream.readerClass.fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class FIleReaderClass {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/readerClass/fileReader/input.txt");

        char array[] = new char[100];
        System.out.println(fr.ready());
        fr.read(array);

        System.out.println(String.valueOf(array));
        fr.close();
    }
}
