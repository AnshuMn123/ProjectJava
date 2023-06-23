package threads.threadMethod.JoinMethods;

class Test extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// here main thread will stop to join the thread-0.
public class JoinTest {
    public static void main(String arg[]) throws InterruptedException {
        Test t = new Test();
        t.start();
        t.join(); // here t thread will excutes and main thread will wait


        for(int i = 1; i <= 5; i++){
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
