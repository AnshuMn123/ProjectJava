package threads.threadMethod.sleepMethods;

class Test extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("i is " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MythreadClass {
    public static void main(String arg[]){
        Test t = new Test();
        t.start();
    }
}
