package oops.abstraction;

abstract  class  Car{
    int price;
    abstract void start();
}

class Audi extends Car{
    void start(){
        System.out.println("Audi");
    }
}

class BMW extends Car{
    void start(){
        System.out.println("BMW");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();

        BMW bmw = new BMW();
        bmw.start();
    }
}
