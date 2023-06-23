package threads.threadMethod.WaitNotify;

class TotalEarning extends Thread{
    int total = 0;
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            notify();
        }
    }
}
public class MovieBookApp {
    public static void main(String arg[]) throws InterruptedException {
        TotalEarning t = new TotalEarning();
        t.start();

//        System.out.println("total earning " + t.total); // it will give 0 because both main and Thread-0 will work together and this line will excute first

        synchronized (t){
            t.wait();
            System.out.println("total earning " + t.total);
        }
    }
}
