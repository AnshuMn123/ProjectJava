package threads.threadMethod.yieldMethod;

class Test extends Thread{
    public void run(){
        for(int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class YieldInfo {
    public static void main(String arg[]){
        Test t = new Test();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
