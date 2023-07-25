package threads.threadMethod.InterruptMethod;

class Test extends Thread{
    public void run(){
        try{
            for(int i = 1; i<=20; i++){
                System.out.println("i is " + i);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class InterruptMethod {
    public static void main(String arg[]){
        Test t = new Test();
        t.start();
        t.interrupt();
    }
}
