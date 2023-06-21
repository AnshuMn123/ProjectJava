package innerClass;

class Outer {
    void outerMethod(){ // Method inside outer class
        System.out.println("inside outerMethod");

        class Inner { // It is local to outerMethod()
            void innerMethod() {// Method inside inner  class
                System.out.println("inside innerMethod");
            }
        }

        Inner y = new Inner(); // Creating object of inner class
        y.innerMethod(); // Calling over method defined inside it
    }
}

public class MethodLocalInnerClasses {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod();
    }
}
