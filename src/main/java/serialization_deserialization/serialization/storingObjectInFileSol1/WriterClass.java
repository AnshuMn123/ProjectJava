package serialization_deserialization.serialization.storingObjectInFileSol1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriterClass {
    public static void main (String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/serialization_deserialization/serialization/storingObjectInFileSol1/file.txt");

        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "Ans";
        s.dept = "CS";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);
    }
}
