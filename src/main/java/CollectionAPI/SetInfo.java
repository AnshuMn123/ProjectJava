package CollectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInfo {
    public static void main(String arg[]){
        Set<Integer> nums = new HashSet<Integer>();
//        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(7);
        nums.add(5);
        nums.add(8);
        nums.add(6);
        nums.add(7);
        nums.add(8);


        for(int n : nums){
            System.out.println(n);
        }

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next() + " : " + values.hashCode());
        }
    }
}
