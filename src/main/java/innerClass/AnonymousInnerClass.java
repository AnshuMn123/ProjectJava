package innerClass;

class Parent{
    void show(){
        System.out.println("in parent");
    }
}
public class AnonymousInnerClass {
    public static void main(String args[]){
        Parent obj = new Parent(){
            void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}


