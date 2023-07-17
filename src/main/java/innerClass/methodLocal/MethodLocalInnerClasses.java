package innerClass.methodLocal;

class A {
    void A_method(){ // Method inside outer class
        System.out.println("inside A_method");

        class B { // It is local to A_method()
            void B_method() {// Method inside inner  class
                System.out.println("inside B_method");
            }
        }

        B y = new B(); // Creating object of inner class
        y.B_method(); // Calling over method defined inside it
    }
}

public class MethodLocalInnerClasses {
    public static void main(String[] args) {
        A x = new A();
        x.A_method();
    }
}
