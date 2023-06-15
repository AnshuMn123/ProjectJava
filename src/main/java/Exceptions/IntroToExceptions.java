package Exceptions;

public class IntroToExceptions {
    public static void main(String arg[]){
        int j =0;
        String str = null;
        int arr[] = new int[5];

        try{
//            j = 18/j;
            System.out.println(j);
            System.out.println(str.length());
            System.out.println(arr[5]);

        }
    	catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
    	catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit.");
        }
    	catch(Exception e)
        {
            System.out.println("Something went wrong. " + e);
        }

        System.out.println("print");
    }
}
