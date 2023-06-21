package innerClass;

class Outer2 {
    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }

    static class Inner { // Static inner class
        public static void display() {
            System.out.println("inside inner class Method");
            outerMethod(); // Calling method inside main() method
        }
    }
}

class StaticNestedClasses {
    public static void main(String args[]) {
        Outer2.Inner.display(); // Calling method static display method rather than an instance of that class.
    }
}
