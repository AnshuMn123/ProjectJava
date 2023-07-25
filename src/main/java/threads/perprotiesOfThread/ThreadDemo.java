package threads.perprotiesOfThread;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println(i);

        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("hi");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1("Ans");

        System.out.println("Id is " + t.getId());
        System.out.println("Thread Name is " + t.getName());

        System.out.println("Priority is " + t.getPriority());
        t.setPriority(10);
        System.out.println("Priority is " + t.getPriority());


        System.out.println("State is " + t.getState());
        t.start();
        System.out.println("State is " + t.getState());

        System.out.println("is alive ? " + t.isAlive());
        System.out.println("thread group is " + t.getThreadGroup());

        System.out.println("Is interrupt ? " + t.isInterrupted());
        t.interrupt();
        System.out.println("Is interrupt ? " + t.isInterrupted());
    }
}
