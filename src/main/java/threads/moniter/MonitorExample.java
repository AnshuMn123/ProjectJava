package threads.moniter;

class MyData{
    void display(String str){
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread{
    MyData data;

    MyThread1(MyData data){
        this.data = data;
    }

    public void run(){
        data.display("Hello ");
    }
}

class MyThread2 extends Thread{
    MyData data;

    MyThread2(MyData data){
        this.data = data;
    }

    public void run(){
        data.display("World ");
    }
}


public class MonitorExample {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
