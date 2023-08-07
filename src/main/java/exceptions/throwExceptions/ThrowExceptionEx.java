package exceptions.throwExceptions;


public class ThrowExceptionEx {
    int area(int l, int b) throws RuntimeException{
        if(l < 0 || b < 0){
            throw new RuntimeException ("cant less than zero");
        }
        return l*b;
    }

    public static void main ( String[] args ) {
        ThrowExceptionEx t = new ThrowExceptionEx ();
        try {
            t.area (-10, 2);
        }catch (RuntimeException e){
            System.out.println (e);
        }

    }
}
