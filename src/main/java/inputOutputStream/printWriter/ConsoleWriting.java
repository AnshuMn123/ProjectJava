package inputOutputStream.printWriter;

import java.io.PrintWriter;

public class ConsoleWriting {
    public static void main (String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Method 2");
        pw.flush();
        pw.close();
    }
}
