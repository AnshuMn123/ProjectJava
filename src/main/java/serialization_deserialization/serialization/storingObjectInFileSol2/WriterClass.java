package serialization_deserialization.serialization.storingObjectInFileSol2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterClass {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/serialization_deserialization/serialization/storingObjectInFileSol2/file.txt");
        DataOutputStream ds = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "Ans";
        s.dept = "CS";

        ds.writeInt(s.rollNo);
        ds.writeUTF(s.name);
        ds.writeUTF(s.dept);
    }
}
