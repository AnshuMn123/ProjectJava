package threads.threadMethod.sleepMethods;

public class SleepInfo {
    public static void main(String arg[]){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println("i is " + i);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
