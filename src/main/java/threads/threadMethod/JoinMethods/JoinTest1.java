package threads.threadMethod.JoinMethods;

public class JoinTest1 extends Thread{
    static Thread mainThread;
    public void run(){
        try {
            mainThread.join(); // here main thread will run then child thread will join after that
            for(int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String arg[]) throws InterruptedException {
        mainThread = Thread.currentThread();
        JoinTest1 t = new JoinTest1();
        t.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
