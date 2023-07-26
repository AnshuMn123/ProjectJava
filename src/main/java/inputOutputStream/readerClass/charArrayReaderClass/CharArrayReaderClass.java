package inputOutputStream.readerClass.charArrayReaderClass;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderClass {
    public static void main(String[] args) throws IOException {
        char[] b = { 'a', 'b', 'c', 'd', 'a', 't', 'p'};
        CharArrayReader cr = new CharArrayReader(b);

        int k = 0;
        while ((k = cr.read()) != -1) {
            System.out.println(k + " : " + (char)k);
        }
    }
}
