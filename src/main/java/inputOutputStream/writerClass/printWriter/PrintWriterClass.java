package inputOutputStream.writerClass.printWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/writerClass/printWriter/file.txt");

        pw.print("Ans");
        pw.println("ajdanc");
        pw.printf("The integer is %d", 23);
        pw.close();
    }
}
