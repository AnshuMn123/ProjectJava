package inputMethod;
import java.io.IOException;

public class ScannerInClass {
    public static void main(String agr[]) throws IOException {

        System.out.println("hello");

        int num = System.in.read(); // this will read onlhy single digits and also gives value in ASCII form
        System.out.println(num - 48);
    }
}
