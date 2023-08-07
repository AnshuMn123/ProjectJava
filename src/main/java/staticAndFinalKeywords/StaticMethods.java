package staticAndFinalKeywords;

class Test{
    static int x = 10;
    int y = 10;
    void show(){
        System.out.println (x + " " + y);
    }

    static void display(){
        System.out.println (x);
//        System.out.println (y);  // non-static variable is not allowed in static methods
    }
}

public class StaticMethods {
    public static void main ( String[] args ) {
        Test t1 = new Test ();
        t1.show ();

        t1.x = 20;
        t1.y = 20;
        t1.show ();

        Test t2 = new Test ();
        t2.show ();
    }
}
