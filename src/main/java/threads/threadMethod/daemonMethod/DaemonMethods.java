package threads.threadMethod.daemonMethod;

class Test extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
public class DaemonMethods {
    public static void main(String arg[]){
        System.out.println("main method");

        Test t = new Test();
        t.setDaemon(true);
        t.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isDaemon());
    }
}
