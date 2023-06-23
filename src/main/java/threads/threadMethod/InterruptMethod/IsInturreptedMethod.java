package threads.threadMethod.InterruptMethod;

class MyThread1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i = 1; i<=5; i++){
                System.out.println("i is " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class IsInturreptedMethod {
    public static void main(String arg[]){
        MyThread1 t = new MyThread1();
        t.start();
        t.interrupt();
    }
}

