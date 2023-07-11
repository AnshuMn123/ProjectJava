package inputOutputStream.StringReaderWriter;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderClass {
    public static void main(String[] args) throws IOException {
        String data = "hello world";
        StringReader sr = new StringReader(data);

        for(int i =0; i < 10; i++) {
            int x = sr.read();
            System.out.print((char) x + " , ");
        }
        sr.close();
    }
}

