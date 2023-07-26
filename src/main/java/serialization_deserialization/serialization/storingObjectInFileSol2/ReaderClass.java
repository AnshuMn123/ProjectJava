package serialization_deserialization.serialization.storingObjectInFileSol2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReaderClass {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/serialization_deserialization/serialization/storingObjectInFileSol2/file.txt");
        DataInputStream ds = new DataInputStream(fis);

        Student s = new Student();

        s.rollNo = ds.readInt();
        s.name = ds.readUTF();
        s.dept = ds.readUTF();

        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.dept);
    }
}
