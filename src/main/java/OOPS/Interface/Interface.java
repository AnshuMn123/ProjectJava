package OOPS.Interface;

interface  Computer{
     void run();
}
class Laptop implements Computer{
    public void run(){
        System.out.println("laptop");
    }
}

class Desktop implements Computer{
    public  void run(){
        System.out.println("Desktop");
    }
}

class Developer{
    void run(Computer lap){
        System.out.println("start working");
    }

}

public class Interface  {
    public static void main(String args[]) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        dev.run(desk); // now this both work

        dev.run(lap);



    }

}
