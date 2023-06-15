package Exceptions;

public class ThrowExceptions {
    public static void main(String arg[]){
        int j =0;

        try{
            j = 18/j;

            if(j == 0){
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong. " + e);
        }
    }
}
