package threads.threadMethod.methodsOfThreadClass;

class Test extends Thread{
    public void run(){
        System.out.println("test thread name " + Thread.currentThread().getName()); // Thread-0
        Thread.currentThread().setName("test1");
        System.out.println("test thread name " + Thread.currentThread().getName()); // test1
        System.out.println("task");
    }
}
public class ThreadName2 {
    public static void main(String arg[]){
        System.out.println(Thread.currentThread().getName()); // main thread is active

        Test t = new Test(); // test thread is active named Thread-0
        t.start();

        Thread.currentThread().setName("Ans"); // again main is active
        System.out.println("New thread name" + Thread.currentThread().getName()); // Ans
        System.out.println("checking for main thread " + Thread.currentThread().isAlive()); // for main
        System.out.println("checking for t " + t.isAlive());
    }
}
