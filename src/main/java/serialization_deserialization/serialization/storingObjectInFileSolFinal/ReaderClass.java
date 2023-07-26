package serialization_deserialization.serialization.storingObjectInFileSolFinal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderClass {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/serialization_deserialization/serialization/storingObjectInFileSolFinal/file.txt");
        ObjectInputStream os = new ObjectInputStream(fis);

        Student s = (Student) os.readObject(); // typecasting is mandatory
        System.out.println(s.rollNo + " " + s.name + " " + s.dept);
    }
}
