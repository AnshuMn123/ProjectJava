package threads.threadMethod.threadsType;

class Demo extends Thread{
    public void run() {
        System.out.println("Single Task");
    }
}

public class SingleTaskFromMultipleThreads {
    public static void main(String arg[]){
        Demo t1 = new Demo();
        t1.start();
        Demo t2 = new Demo();
        t2.start();
    }
}

