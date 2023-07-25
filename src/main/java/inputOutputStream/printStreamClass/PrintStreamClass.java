package inputOutputStream.printStreamClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamClass {
    public static void main (String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/printStreamClass/file.txt");
        PrintStream ps = new PrintStream(fos);

        //or

//        PrintStream ps = new PrintStream(new FileOutputStream("dajncqe"));
        Student s = new Student();
        s.rollNo = 10;
        s.name = "Ans";
        s.dept = "CS";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);
    }
}