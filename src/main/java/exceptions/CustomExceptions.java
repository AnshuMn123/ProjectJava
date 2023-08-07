package exceptions;

class CustomException extends RuntimeException{
    CustomException(String str){
        super(str);
    };
}
public class CustomExceptions {
    public static void main( String[] arg ) {
        int j =20;
        j = 18/20;
        try {
            if (j <= 0) {
                throw new CustomException("I don't want to print zero");
            }
        }catch(CustomException e){
            e.printStackTrace();
        }
    }
}
