package oops.encapsulation.accessModifiers;

public class Other{
    public static void main(String[] args) {

        A obj=new A();
        System.out.println(obj.marks);
        obj.show();

        B obj1=new B();
        System.out.println(obj.marks);

    }
}