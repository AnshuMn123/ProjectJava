package Lambda;

@java.lang.FunctionalInterface
interface Man{
    void run();
}

//class human implements man{
//    public void run(){
//        System.out.println("run");
//    }
//}
public class FunctionalInterface {
    public static void main(String arg[]){
        Man obj = new Man(){
            public void run(){
                System.out.println("run1");
            }
        };
        obj.run();
    }
}
