package lambda;

public class LambdaInRunnable {
    public static void main(String arg[]){
        Runnable basic = () ->   System.out.println(Thread.currentThread().getName()); ;
        Thread th1 = new Thread(basic);
        Thread th2 = new Thread(basic);

        th1.start();
        th2.start();
    }
}
