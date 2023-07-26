package inputOutputStream.objectStream.CustomerClassSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerOutput {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/objectStream/CustomerClassSerialization/file.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        Customer[] list = {new Customer("a","1"), new Customer("a", "1"), new Customer("a", "1"), new Customer("a", "1")};

        os.writeInt(list.length);
        for(Customer x : list){
            os.writeObject(x);
        }

        fos.close();
        os.close();
    }
}
