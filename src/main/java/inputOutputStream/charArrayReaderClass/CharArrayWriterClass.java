package inputOutputStream.charArrayReaderClass;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterClass {
    public static void main(String[] args) throws IOException {
        CharArrayWriter cw = new CharArrayWriter();
        CharArrayWriter cw1 = new CharArrayWriter();


        cw.write('a');
        cw.write('a');
        cw.write('a');
        cw.write('a');
        cw.write('a');

        System.out.println(cw.toCharArray());
        cw.append('c');
        System.out.println(cw);


        char[] c = {'G', 'E', 'E', 'K', 'S'};
        cw1.write(c, 2, 3);
        System.out.println(cw1.toCharArray());

        cw.writeTo(cw1);

    }
}
