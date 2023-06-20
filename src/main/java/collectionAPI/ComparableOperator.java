package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class child implements Comparable<child>{
    int age;
    String name;

    child(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " : " + name;
    }

    public int compareTo(child that) {
        return this.age > that.age ? 1 : -1;
    }
}
public class ComparableOperator {
    public static void main(String arg[]){
        Comparator<child> cmp = (child i, child j) -> i.age > j.age ? 1 : -1;

        List<child> nums = new ArrayList<child>();
        nums.add(new child(19, "An"));
        nums.add(new child(16, "Hr"));
        nums.add(new child(11, "St"));
        nums.add(new child(15, "dj"));

        for(child n : nums){
            System.out.println(n);
        }

        Collections.sort(nums); // it is working because of comparable operator made in class itself

        System.out.println(nums);

        Collections.sort(nums, cmp);
        System.out.println(nums);

    }
}

