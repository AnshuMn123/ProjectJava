package threads.threadMethod;

class Multithreading extends Thread {
    public void run() {
        try {
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running"); // Displaying the thread that is running
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class ThreadingWithExtendingThread {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Multithreading obj = new Multithreading();
            obj.start();
        }
    }
}
