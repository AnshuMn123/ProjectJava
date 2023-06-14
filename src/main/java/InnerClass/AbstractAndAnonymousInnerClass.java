package InnerClass;

abstract class Parent1{
    abstract void show();

}
public class AbstractAndAnonymousInnerClass {
    public static void main(String arg[]){
        Parent1 obj = new Parent1() {
            void show() {
                System.out.println("in show");
            }
        };
        obj.show();

    }
}
