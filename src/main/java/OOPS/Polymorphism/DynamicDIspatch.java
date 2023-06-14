package OOPS.Polymorphism;

class Parent{
    void Show(){
        System.out.println("Parent");
    }
}

class child1 extends Parent{
    void Show(){
        System.out.println("child1");
    }
}

class child2 extends Parent{
    void Show(){
        System.out.println("child2");
    }
}

class child3 {
    void Show(){
        System.out.println("Parent");
    }
}
public class DynamicDIspatch {
    public static void main(String a[]){
        Parent obj = new Parent();
        obj.Show();

        obj = new child1();
        obj.Show();

        obj = new child2();
        obj.Show();

         // obj = new child3(); // cant do this because it is not subclass for parent
        obj.Show();

    }
}
