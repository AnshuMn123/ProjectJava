package threads.threadMethod.joinMethods;

class MyThread extends Thread{
    public void run(){
        for(int i = 0; ; i++){
            System.out.println(i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        Thread mainThread = Thread.currentThread();
        mainThread.join();
    }
}
