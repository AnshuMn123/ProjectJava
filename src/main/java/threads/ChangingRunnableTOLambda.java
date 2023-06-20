package threads;

public class ChangingRunnableTOLambda {
    public static void main(String arg[]){

        Runnable obj1 = new Runnable(){
            public void run()
            {
                for(int i = 0; i <=5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable obj2 = new Runnable()
        {
            public void run()
            {
                for(int i = 0; i <= 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
