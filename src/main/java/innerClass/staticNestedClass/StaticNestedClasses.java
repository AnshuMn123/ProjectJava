package innerClass.staticNestedClass;

class A1 {
    static  int x = 10;
    int y = 10;
    private static void A1_method() {
        System.out.println("inside A1_method");
    }

    static class B1 { // Static inner class
        public static void display() {
            System.out.println("inside inner class Method");
            A1_method(); // Calling method inside main() method

            System.out.println (x); // allowed
//            System.out.println (y); // not allowed
        }
    }
}

class StaticNestedClasses {
    public static void main(String args[]) {
        A1.B1.display(); // Calling method static display method rather than an instance of that class.
    }
}
