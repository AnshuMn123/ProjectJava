package threads.threadMethod.synchronization.bySynchronizedMethod;

class BookTheatreSeat{
    int total_seat = 10;
    synchronized void bookSeat(int seat){
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

public class MovieBookApp extends Thread {
    static BookTheatreSeat b;
    int seat;
    public void run(){
        b.bookSeat(seat);

    }
    public static void main(String arg[]){
        b = new BookTheatreSeat();

        MovieBookApp ans = new MovieBookApp();
        ans.seat = 7;
        ans.start();

        MovieBookApp sin = new MovieBookApp();
        sin.seat = 6;
        sin.start();
    }
}
