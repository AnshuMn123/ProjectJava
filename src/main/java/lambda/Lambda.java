package lambda;

interface A{
    void run();
}

interface A1{
    void run1(int i);
}

interface A2{
    void run2(int i, int j);
}
public class Lambda {
    public static void main(String arg[]){

   /*      1. method my using fuinctional interface
        A a = new A(){
            public void run(){
                System.out.println("run");
            }
        };
        a.run();
    */


        // using lambda function
        A a = () -> System.out.println("run");
        a.run();


        // using lambda function
        A1 a1 = i -> System.out.println("run1 " + i);
        a1.run1(5);

        // using lambda function
        A2 a2 = (i, j) -> System.out.println("run2 " + i + " : " + j);
        a2.run2(5, 6);

    }
}
