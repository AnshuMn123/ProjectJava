package threads.threadMethod.joinMethods;

class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical Start");
            Thread.sleep(1000);
            System.out.println("Medical Completed");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TestDriver extends Thread{
    public void run(){
        try{
            System.out.println("test drive Start");
            Thread.sleep(1000);
            System.out.println("test drive Completed");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class OfficerSign extends Thread{
    public void run(){
        try{
            System.out.println("Officer Sign Start");
            Thread.sleep(1000);
            System.out.println("Officer Sign Completed");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class LicenseDemo {
    public static void main(String arg[]) throws InterruptedException {
        Medical md = new Medical();
        md.start();
        md.join();

        TestDriver td = new TestDriver();
        td.start();
        td.join();

        OfficerSign os = new OfficerSign();
        os.start();
        os.join();
    }
}
