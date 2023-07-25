package threads.perprotiesOfThread;

class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0;  i < 5; i++){
            System.out.println(i);
        }
    }
}

public class ConstructorClass {
    public static void main(String[] args) {
        // 1. Thread()
        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);
        th.start();

        // 2. Thread(String name)
        Thread t2 = new Thread("My Name");
        t2.start();

        // 3. Thread(Runnable r)
        Thread t3 = new Thread(new MyThread());
        t3.start();

        // 4. Thread(Runnable r, String name)
        Thread t4 = new Thread(new MyThread(), "My Name");
        t4.start();


        // all these are working with runnable interface otherwise
        // we need to pass the constructor of every MyThread Class
    }

}
