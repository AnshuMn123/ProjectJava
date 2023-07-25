package inputOutputStream.byteArray;

import java.io.ByteArrayInputStream;

public class ByteArrayInput {
    public static void main(String[] args) {
        byte[] b = { 65, 66, 67, 68 };
        ByteArrayInputStream byt = new ByteArrayInputStream(b);

//        String str = new String(byt.readAllBytes());
//        System.out.println(str);

        // or

        int k = 0;
        while ((k = byt.read()) != -1) {
            System.out.println("ASCII value of " + k + " is " + (char) k);
        }
    }
}
