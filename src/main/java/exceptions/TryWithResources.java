package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main( String[] arg ) throws IOException {

        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num=Integer.parseInt(br.readLine());
            System.out.println(num);

        }
    }
    //here we do not need of finally because buffered-reader is autocloseable, and it will close after try statement
    // so working same as finally
}
