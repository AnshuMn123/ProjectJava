package threads.RunnableMethod;

class Multithreading implements Runnable {
    public void run() {
        try {
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread object = new Thread(new Multithreading());
            object.start();
        }
    }
}
