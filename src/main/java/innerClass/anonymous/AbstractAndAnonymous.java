package innerClass.anonymous;

abstract class Parent1{
    abstract void show();

}
public class AbstractAndAnonymous {
    public static void main( String[] arg ){
        Parent1 obj = new Parent1() {
            void show() {
                System.out.println("in show");
            }
        };
        obj.show();

    }
}
