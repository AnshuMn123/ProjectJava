package inputOutputStream.pipedStreamClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream os){
        this.os = os;
    }

    public void run(){
        int count =  1;
        while (true){
            try {
                os.write(count);
                os.flush();
                System.out.flush();
                System.out.println("Producer " + count);
                count++;
                Thread.sleep(1000);
            } catch (IOException e) {} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread   {
    InputStream is;

    public Consumer(InputStream is){
        this.is = is;
    }
    public void run(){
        int count;
        while (true){
            try {
                count = is.read();
                System.out.flush();
                System.out.println("Consumer " + count);
            } catch (IOException e) {}

        }
    }
}

public class PipedStreamClass {
    public static void main(String[] args) throws IOException {

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
