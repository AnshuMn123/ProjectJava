package InputMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String arg[]) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in); // this is for reading the line
        BufferedReader bf = new BufferedReader(in); // main method and in should be pass

        int num = Integer.parseInt(bf.readLine()); // reading bf value in string and then converting it in integer using parseint

        System.out.println(num);

        bf.close(); // after use close it (good habbit)

    }
}
