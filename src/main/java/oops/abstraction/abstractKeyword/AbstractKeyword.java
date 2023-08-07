package oops.abstraction.abstractKeyword;

abstract class Car{
    abstract void drive();
    abstract void fly();

    void Music(){
        System.out.println("play music");
    }
}

abstract class Wagoner extends Car{
    void drive() {
        System.out.println("driving");
    }
}
class UpdatedWagoner extends Wagoner {
    void fly(){
        System.out.println("fly..");
    }
}

public class AbstractKeyword {
    public static void main(String a[]){
        Car obj = new UpdatedWagoner ();
        obj.drive();
        obj.fly();
        obj.Music();
    }
}
