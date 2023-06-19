package ControlStatements;

public class BreakContinueReturnStatement {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)  // If the number is even skip and continue
                continue;
            System.out.println(i + " ");  // If number is odd, print it
        }

        for (int i = 0; i < 10; i++) {
            if (i > 5)
                break;
            System.out.print(i + " ");  // print till 5
        }
    }
}
