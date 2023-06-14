package OOPS.Interface;

interface Car{

    int age = 12; // variable are final and static in interface
    String name = "An";
    void show(); // methods are public and abstract in interface
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    void sleep();
}

class Wagnor implements Car, Y{

    public void show() {
        System.out.println("show");

    }

    public void config() {
        System.out.println("config");


    }

    public void run() {
        System.out.println("run");

    }

    public void sleep() {
        System.out.println("sleep");
    }
}
public class MoreOnInterFace {
    public static void main(String arg[]){
        Wagnor wag = new Wagnor();
        wag.config();
        wag.show();
        wag.sleep();
        wag.run();

        System.out.println(Car.age);
        System.out.println(Car.name);

    }
}
