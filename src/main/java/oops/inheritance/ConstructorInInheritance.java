package oops.inheritance;

class Child{
    public Child() {
        System.out.println("Child constructor");
    }
}

class Parent extends Child{
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class GrandParent extends Parent{
    public GrandParent() {
        System.out.println("GrandParent constructor");
    }
}

public class ConstructorInInheritance {
    public static void main (String[] args) {
        GrandParent gp = new GrandParent();

    }
}
