package inputOutputStream.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamClass {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/objectStream/file.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        Student s = new Student(10, "Ans", 89.4f, "CS");
        os.writeObject(s);
    }
}
