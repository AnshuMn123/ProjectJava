package inputOutputStream.objectStream.CustomerClassSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class CustomerInputClass {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/objectStream/CustomerClassSerialization/file.txt");
        ObjectInputStream os = new ObjectInputStream(fis);

        int l = os.readInt();
        for(int i = 0; i < l; i++) {
//            Customer c = (Customer) os.readObject();
//            System.out.println(c.toString());
//
//            or
            System.out.println(os.readObject().toString());
        }

        fis.close();
        os.close();
    }
}
