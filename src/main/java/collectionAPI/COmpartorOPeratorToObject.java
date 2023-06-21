package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " : " + name;
    }
}
public class COmpartorOPeratorToObject {
    public static void main(String arg[]){
        Comparator<Student> cmp = (Student i, Student j) -> i.age > j.age ? 1 : -1;

        List<Student> nums = new ArrayList<Student>();
        nums.add(new Student(55, "An"));
        nums.add(new Student(16, "Hr"));
        nums.add(new Student(71, "St"));
        nums.add(new Student(32, "dj"));

        for(Student n : nums){
            System.out.println(n);
        }

        System.out.println(nums);

        Collections.sort(nums, cmp);
        System.out.println(nums);

    }
}

