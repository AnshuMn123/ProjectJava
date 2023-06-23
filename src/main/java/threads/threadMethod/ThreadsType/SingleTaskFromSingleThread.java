package threads.threadMethod.ThreadsType;

class Test extends Thread{
    public void run() {
        System.out.println("Single Task");
    }
}

public class SingleTaskFromSingleThread {
    public static void main(String arg[]){
        Test t = new Test();
        t.start();
    }
}
