package threads.threadMethod.synchronization.bySynchronizedStatic;

class BookTheatreSeat{
    static int total_seat = 20;
    synchronized static void bookSeat(int seat){
        if(total_seat >= seat) {
            System.out.println(seat + " seat are book successfully");
            total_seat -= seat;
            System.out.println(total_seat + " are left");
        }else{
            System.out.println("Sorry seat can't booked...");
            System.out.println(total_seat + " are left");
        }
    }
}

class MyThread1 extends Thread{
    BookTheatreSeat b;
    int seat;

    MyThread1(BookTheatreSeat b, int seat){
        this.b = b;
        this.seat = seat;
    }

    public void run(){
        b.bookSeat(seat);
    }
}

class MyThread2 extends Thread{
    BookTheatreSeat b;
    int seat;

    MyThread2(BookTheatreSeat b, int seat){
        this.b = b;
        this.seat = seat;
    }

    public void run(){
        b.bookSeat(seat);
    }
}


public class MovieBookApp {
    public static void main(String arg[]){
        BookTheatreSeat b1 = new BookTheatreSeat();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();

        BookTheatreSeat b2 = new BookTheatreSeat();
        MyThread1 t3 = new MyThread1(b2, 5);
        t3.start();
        MyThread2 t4 = new MyThread2(b2, 8);
        t4.start();
    }
}
