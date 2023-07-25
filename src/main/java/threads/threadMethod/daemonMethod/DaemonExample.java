package threads.threadMethod.daemonMethod;

class MyThread extends Thread{
    public void run(){
        for(int i = 0; ; i++){
            System.out.println(i);
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
