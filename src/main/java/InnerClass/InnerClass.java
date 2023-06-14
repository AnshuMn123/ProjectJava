package InnerClass;

class A{
    int n = 10;
    void show(){
        System.out.println("show");
    }

    class B{
        public void config(){
            System.out.println("config");
        }
    }

    static class C{
        public void s_static(){
            System.out.println("static");
        }
    }
}
public class InnerClass {
    public static void main(String a[]){
        A obj = new A();

        obj.show();

        A.B obj1 = obj.new B(); // for creating obj for nonstatic we need obj of parent to inistize it
        obj1.config();

        A.C obj2 = new A.C(); // but for static we can create like these also
        obj2.s_static();

    }
}
