package oops.polymorphism;

class  A{}
class B extends A{}

class Car{
    private A display(){
        return new A();
    }
}

class Car1 extends Car{
    public B display(){ // it is allowed
        return new B();
    }
}

public class ReturnTypeOfOverriding {
    public static void main ( String[] args ) {

    }
}
