package oops.abstraction;


abstract class Shape{
    public abstract double parimeter();
    public abstract double area();
}

class Circle extends Shape{
    int radius;
    public double parimeter ( ) {
        return 2 * Math.PI * radius;
    }

    public double area ( ) {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    int l, b;
    public double parimeter ( ) {
        return 2*(l+b);
    }

    public double area ( ) {
        return l*b;
    }
}

public class ShapeAbstraction {
    public static void main ( String[] args ) {
        Circle c = new Circle ();
        c.radius = 7;
        System.out.println (c.area ());
        System.out.println (c.parimeter ());

        Rectangle r = new Rectangle ();
        r.l  = 9;
        r.b = 9;
        System.out.println (r.area ());
        System.out.println (r.parimeter ());
    }
}
