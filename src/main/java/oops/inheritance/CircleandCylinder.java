package oops.inheritance;

class Circle {
    public double radius;

    public double area() {
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area()*height;
    }
}

public class CircleandCylinder {
    public static void main(String a[]) {
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;
        System.out.println("area : " + c.area());
        System.out.println("volume : " + c.volume());
    }
}

