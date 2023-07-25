package threads.runnableMethod;

// we cannot extend class A2 for two class but of not allowing multiple inheritance
// so instead of extend thread class, we implement their interface "runnable" so that we can extend the class
class A2 implements java.lang.Runnable {
    public void run() {
        for(int i = 0; i <=5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B2 implements java.lang.Runnable {
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableInfo {
    public static void main(String arg[]){
        A2 obj1 = new A2(); // here after implementation we cannt find the start method directly so we implemented created the thread object and passing over it
        B2 obj2 = new B2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
