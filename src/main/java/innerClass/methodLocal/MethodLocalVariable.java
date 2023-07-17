package innerClass.methodLocal;

class A1 {
    void A1_method() {
        final int x=98;
        System.out.println("inside A1_method");
        class B1 {
            void B1_method() {
                System.out.println("x = "+x);
            }
        }
        B1 y = new B1();
        y.B1_method();
    }
}
public class MethodLocalVariable {
    public static void main(String[] args){
        A1 x = new A1();
        x.A1_method();
    }
}
