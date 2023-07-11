package inputOutputStream.WriterClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/WriterClass/input.txt"));

        bw.write("array 1\n");
        bw.write("array 2");
        bw.close();
    }
}
