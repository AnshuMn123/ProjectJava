package inputOutputStream.pipedStreamClass;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInput {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos); // Use of connect() : connecting pis with pos

        pos.write(71);
        System.out.println((char)pis.read());

        pos.write(75);
        System.out.println((char)pis.read());
    }
}

