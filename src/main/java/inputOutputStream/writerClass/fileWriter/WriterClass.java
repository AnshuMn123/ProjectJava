package inputOutputStream.writerClass.fileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/writerClass/fileWriter/file.txt");

        char array[] = {'a', 'b', 'c', 'd', 'e'};
        fw.write(array);
        fw.write("abc");
        fw.close();
    }
}
