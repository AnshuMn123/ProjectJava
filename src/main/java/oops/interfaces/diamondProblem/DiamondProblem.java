package oops.interfaces.diamondProblem;

interface A {
    default void display() {
        System.out.println("the display() method of A invoked");
    }
}
interface B {
     default void display() {
        System.out.println("the display() method of B invoked");
    }
}
public class DiamondProblem implements A, B {
    public void display() {
        A.super.display();
        B.super.display();
    }
    public static void main(String args[]) {
        DiamondProblem obj = new DiamondProblem();
        obj.display();
    }
}
