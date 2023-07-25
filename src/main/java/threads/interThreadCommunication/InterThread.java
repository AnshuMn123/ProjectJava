package threads.interThreadCommunication;

class MyData{
    int value = 0;
    boolean flag = true;
    synchronized public void set(int i){
        while(flag != true){
            try {  wait();} catch (InterruptedException e) {
                System.out.println(e); }
        }

        value = i;
        flag = false;
        notify();
    }

    synchronized public int get(){
        while(flag == true){
            try {  wait();} catch (InterruptedException e) {
                System.out.println(e); }
        }
        int x = 0;
        x = value;
        flag = true;
        notify();
        return  x;
    }
}

class Producer extends Thread{
    MyData data;

    public Producer(MyData data) {
        this.data = data;
    }

    public void run(){
        int i = 0;
        while(true) {
            data.set(i);
            i++;
            System.out.println("Producer " + i );
        }
    }
}

class Consumer extends Thread{
    MyData data;

    public Consumer(MyData data) {
        this.data = data;
    }

    public void run(){
        int value;
        while (true){
            value = data.get();
            System.out.println("Consumer " + value);
        }

    }
}

public class InterThread {
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
