package lambda;

interface FuncInterface {
    void abstractFun(int x); // An abstract function

    default void normalFun() { // A non-abstract (or default) function
        System.out.println("Hello");
    }
}

public class LamdaEx {
    public static void main(String args[]) {
        FuncInterface f = x ->   System.out.println(2*x);
        f.abstractFun(5);
    }
}
