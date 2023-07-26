package inputOutputStream.objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectInputStreamClass {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
            FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/objectStream/file.txt");

            ObjectInputStream os = new ObjectInputStream(fis);
            Student s = (Student) os.readObject();
            System.out.println(s.toString());
    }
}
