package inputOutputStream.outputStream;

public class OutputTypes {
    public static void main(String[] args) {
        System.out.print("aa ");
        System.out.print("bb ");
        System.out.println();

        System.out.println("aa ");
        System.out.println("bb ");
        System.out.println();

        int x = 100;
        System.out.printf("Printing simple"  + " integer: x = %d\n", x); //%d is for integer type

        System.out.printf( "Formatted with"   + " precision: PI = %.2f\n",   Math.PI); // %/.2f for float with 2 decimal place

        float n = 5.2f;
        System.out.printf("Formatted to " + "specific width: n = %.4f\n",  n); // %.4\n for appendinf r zeros in last

        n = 2324435.3f;
        System.out.printf( "Formatted to " + "right margin: n = %20.4f\n",  n); // %20.4f\n is for .4f\n means 4 zero and 20 means right margin and occupies a width oif 20 char
    }
}

