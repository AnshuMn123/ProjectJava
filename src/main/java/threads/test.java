package threads;

public class test implements Runnable {
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("a");
    }

    public static void main(String[] args) {
        test th = new test();
        Thread t = new Thread(th);
        t.setDaemon(true);
        t.start();
        System.out.println("ovr");
    }
}
