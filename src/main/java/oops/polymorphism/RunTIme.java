package oops.polymorphism;

class A {
    void Show() {
        System.out.println("hello");

    }
}

class B extends A{
    void show(){
        System.out.println("hello World");

    }
}

public class RunTIme {
        public static void main(String args[]) {
            B b = new B();
            b.show();
        }

}
