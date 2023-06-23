package threads.threadMethod.sleepMethods;

class MyThread extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + " of " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class SleepInMultiThreading {
    public static void main(String arg[]){
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
    }
}
