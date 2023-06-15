package Exceptions;

class Custom extends Exception{
    public Custom(String str){
        super(str);
    };

}
public class CustomExceptions {
    public static void main(String arg[]){
        int j =20;

        try{
            j = 18/j;

            if(j == 0){
                throw new Custom("I don't want to print zero");
            }
        }
        catch(Custom e)
        {
            System.out.println("Cannot divide by zero " + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong. " + e);
        }
    }
}
