package exceptions.tryCatch;

public class PrintStackEx {
    static void divide(){
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace(); // exception information in the format of Name of the exception: description of the exception, stack
//            System.out.println(e.toString()); // exception information in the format of Name of the exception: description of the exception.
//            System.out.println(e.getMessage()); // description of exception
        }
    }

    public static void main( String[] arg ){
        int a = 5;
        int b = 0;
        divide();
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
              e.printStackTrace(); // exception information in the format of Name of the exception: description of the exception, stack
//            System.out.println(e.toString()); // exception information in the format of Name of the exception: description of the exception.
//            System.out.println(e.getMessage()); // description of exception
        }

    }

}
