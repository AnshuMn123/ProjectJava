package Threads;

class A1 extends Thread
{
    public void run() {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B1 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {

            }
        }
    }
}

public class ThreadPriorityAndSleepTime {

    public static void main(String arg[]){
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj2.setPriority(Thread.MAX_PRIORITY); // for setting priority from 1 to 10

        obj1.start();

        try {
            Thread.sleep(2);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
    }
}
