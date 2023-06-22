package threads.threadMethod.methodsOfThreadClass;

public class ThreadName {
    public static void main(String arg[]){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ans");
        System.out.println("New thread name" + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
}
