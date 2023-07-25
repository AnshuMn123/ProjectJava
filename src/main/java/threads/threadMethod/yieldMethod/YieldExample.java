package threads.threadMethod.yieldMethod;

class MyThread extends Thread{
    public void run(){
        for(int i = 0; ; i++){
            System.out.println(i + " My Thread");
        }
    }
}

public class YieldExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        for(int i = 0; ; i++){
            System.out.println(i + " Main");
            Thread.yield();
        }
    }
}
