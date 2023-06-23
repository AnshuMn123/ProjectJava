package threads.threadMethod.InterruptMethod;

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());
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

public class InterruptedMethod {
    public static void main(String arg[]){
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
    }
}
