package threads;

class Count{
    int count = 0;
    public synchronized void increment(){ // finally we make method to synchronized so that after compeltion of one another will call
        count++;
    }
}
public class RaceCondition {
    public static void main(String arg[]) throws InterruptedException {
        Count c = new Count();
        Runnable A1 = () ->
        {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable B1 = () ->
        {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(A1);
        Thread t2 = new Thread(B1);

        t1.start();
        t2.start();

        t1.join(); // this is to make one wait to complete the task and then other to run
        t2.join(); // this can throw error so we need to add handle errors

        System.out.println(c.count);
    }
}
