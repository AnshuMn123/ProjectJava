package innerClass.nestedClass;

class A{
    static void show(){
        System.out.println("show");
    }

     class B{
        public void config(){
            System.out.println("config");
        }
    }

    static class C{
        public static void s_static(){
            System.out.println("static");
        }
    }
}

public class NestedInnerClass {
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); // for creating obj for nonstatic we need obj of parent to inistize it
        obj1.config();

        //or
        A.B obj2 = new A().new B();
        obj2.config();

        A.C obj3 = new A.C(); // but for static we can create like these also
        obj3.s_static();
        //or
        A.C.s_static();

    }
}
