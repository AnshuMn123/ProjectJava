package inputOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemErr {
    public static void main(String args[]) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in); // Storing the input in inp
        System.out.println("Enter characters, " + " and '0' to quit.");

        char c;
        do {
            c = (char)inp.read();
            System.out.println(c);
        } while (c != '0');
    }
}

