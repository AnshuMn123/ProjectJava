package inputOutputStream.WriterClass;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class BufferWriterClass {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/WriterClass/input.txt"));

        //or
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/WriterClass/input.txt")));

        bw.write("array 1\n");
        bw.write("array 2");
        bw.close();
    }

    public static class WriterClassExample {
        public static void main(String[] args) throws IOException {
            char[] arr = {'A', 'B', 'C', 'D', 'E' };

            Writer w = new PrintWriter(System.out);
            w.write(65);
            w.write(66);
            w.write(67);
            System.out.println("1 Using write(int char[]) : ");
            w.flush();
            System.out.println();


            Writer w2 = new PrintWriter(System.out);
            String str = "Hello";
            w2.write(str);
            System.out.println("2 Using write(String str) : ");
            w2.flush();
            System.out.println();


            Writer w3 = new PrintWriter(System.out);
            w3.write(str, 1, 2);
            System.out.println("3 Using write(str, offset, maxlen) : ");
            w3.flush();
            System.out.println();


            Writer w4 = new PrintWriter(System.out);
            w4.write(arr);
            System.out.println("4 Using write(char[] arr) : ");
            w4.flush();
            System.out.println();

            Writer w5 = new PrintWriter(System.out);
            w5.write(arr, 1, 3);
            System.out.println("5 Using write(arr, offset, maxlen) : ");
            w5.flush();
            System.out.println();


            w.close();
            w2.close();
            w3.close();
            w4.close();
            w5.close();
        }
    }
}
