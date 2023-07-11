package threads;

public class DeadLock {
    public static void main(String[] args) {
        String s1 = "Anshu";
        String s2 = "Singh";

        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    synchronized (s1){
                        try {
                            System.out.println(Thread.currentThread().getName() + " locked " + s1);
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (s2){
                            System.out.println(Thread.currentThread().getName() + " locked " + s2);
                        }
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName() + " locked " + s2);
                        synchronized (s1){
                            System.out.println(Thread.currentThread().getName() + " locked " + s1);
                        }
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
