package collectionAPI.compartorOperator;

import  java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo; this.name = name; this.address = address;
    }

    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }
}

class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) { // Sorting in ascending order of rollNo
        return a.rollNo - b.rollNo;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) { // Sorting in ascending order of name
        return a.name.compareTo(b.name);
    }
}

public class Compare {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        System.out.println();

        Collections.sort(ar, new SortByRoll());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        System.out.println();
        

        Collections.sort(ar, new SortByName());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
