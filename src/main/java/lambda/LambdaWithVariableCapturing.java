package lambda;

import java.io.*;
interface MyFunction {
    // Method inside the interface
    int func(int n);
}

public class LambdaWithVariableCapturing {
    public static void main(String[] args) {
        int number = 10;
        MyFunction f = n ->  number + n;
        System.out.println(f.func(5));
    }
}
