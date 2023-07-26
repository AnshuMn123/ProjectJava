package inputOutputStream.readerClass.bufferedReaderClass.bufferedReaderClassEx;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class BufferedReaderClassEx {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/bufferedReaderClass/file.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        //or
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/bufferedReaderClass/file.txt")));


        Student s = new Student();
        s.rollNo = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.dept);
    }
}
