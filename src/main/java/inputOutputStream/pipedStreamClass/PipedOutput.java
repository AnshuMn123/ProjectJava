package inputOutputStream.pipedStreamClass;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutput {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos); // Use of connect() : connecting pis with pos

        byte[] buffer = {'J', 'A', 'V', 'A'};

        pos.write(buffer);
        while(true) {
            System.out.print((char) pis.read());
        }
    }
}

