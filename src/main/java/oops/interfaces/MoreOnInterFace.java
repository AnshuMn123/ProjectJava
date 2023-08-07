package oops.interfaces;

interface Car {
    int age = 12; // variable are final and static in interface
    String name = "An";

    void run ( ); // methods are public and abstract in interface
}

interface MorderCar extends Car{
    void music();
}

class Wagner implements Car, MorderCar{
    public void run() {
        System.out.println("run");
    }

    public void music() {
        System.out.println("music");
    }

    public void show() {
        System.out.println("show");
    }
}
public class MoreOnInterFace {
    public static void main(String[] arg){
        Wagner w = new Wagner();
        w.show();
        w.music();
        w.run();

        System.out.println(Car.age);
        System.out.println(Car.name);
    }
}
