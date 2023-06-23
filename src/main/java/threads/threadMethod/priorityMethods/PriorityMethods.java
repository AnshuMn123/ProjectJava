package threads.threadMethod.priorityMethods;

class Test extends Thread{
    public void run() {
        System.out.println("child thread priority is " +  Thread.currentThread().getPriority());
    }
}

public class PriorityMethods {
    public static void main(String arg[]){
        System.out.println("main thread priority is " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("new main thread priority is " + Thread.currentThread().getPriority());

        Test t = new Test();
        t.setPriority(3);
        t.start();
    }
}
