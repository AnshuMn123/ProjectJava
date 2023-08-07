package oops.interfaces;

interface A{
     int i = 5; // not allowed
     void car();

    private void car1 ( ){ // not allowed
        System.out.println ("hello private");
    }

    default void car2(){
        car1();
    }
}

public class PrivateAndDefaultInInheritance {
}
