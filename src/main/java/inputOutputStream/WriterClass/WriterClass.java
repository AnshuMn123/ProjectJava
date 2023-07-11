package inputOutputStream.WriterClass;

import java.io.*;

public class WriterClass {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/WriterClass/output.txt");

        char array[] = {'a', 'b', 'c', 'd', 'e'};
        fw.write(array);
        fw.write("abc");
        fw.close();
    }
}
