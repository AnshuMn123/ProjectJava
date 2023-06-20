package Exceptions;

public class Expe {
    public static void main (String[] args)
    {
        int[] arr = new int[4];

        try
        {
            int i = arr[4];
            System.out.println("Inside try block");
        }
        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught");
        }
        catch (Exception e){
            System.out.println("s");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-catch-finally clause");
    }
}
