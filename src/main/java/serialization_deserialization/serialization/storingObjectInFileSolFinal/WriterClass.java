package serialization_deserialization.serialization.storingObjectInFileSolFinal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterClass {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/serialization_deserialization/serialization/storingObjectInFileSolFinal/file.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "Ans";
        s.dept = "CS";

        os.writeObject(s);
    }
}
