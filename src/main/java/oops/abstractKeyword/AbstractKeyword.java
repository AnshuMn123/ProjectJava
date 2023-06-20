package oops.abstractKeyword;

abstract class Car{
    abstract void drive();

    abstract void fly();
    void Music(){
        System.out.println("play music");
    }
}

abstract class Wagnor extends Car{
    void drive() {
        System.out.println("driving");

    }
}
class UpdatedWagnor extends Wagnor{
    void fly(){
        System.out.println("fly..");
    }

}


public class AbstractKeyword {
    public static void main(String a[]){
        Car obj = new UpdatedWagnor();
        obj.drive();
        obj.fly();
        obj.Music();
    }

}
