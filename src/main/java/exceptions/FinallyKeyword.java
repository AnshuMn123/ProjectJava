package exceptions;

public class FinallyKeyword {
    public static void main(String arg[]){

        int j = 0;

        try
        {
            j = 18/j;
            System.out.println(j);

        }
        catch (Exception e){
            System.out.println("throw exception");
        }
        finally
        {
            System.out.println("done");
        }
    }
}
