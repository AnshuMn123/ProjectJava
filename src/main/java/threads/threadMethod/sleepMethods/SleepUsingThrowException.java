package threads.threadMethod.sleepMethods;

public class SleepUsingThrowException {
    public static void main(String arg[]) throws InterruptedException {
        for(int i = 1; i <= 5; i++){
            Thread.sleep(1000);
            System.out.println("i is " + i);
        }
    }
}


