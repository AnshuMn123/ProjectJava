package lambda;

interface B{
    int add(int i , int j);
}
public class LambdaReturnType {
    public static void main(String arg[]){
//        1. functional interface
        B b = new B(){
            public int add(int i, int j){
                return i + j;
            }
        };
        System.out.println(b.add(5, 9));


        // if we have one return type then we need not mention the return key in return expression
        B b1 = (i, j) -> i + j;
        System.out.println(b1.add(5,8));

    }
}
