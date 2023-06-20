package collectionAPI.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ArraylistInfo {
    public static void main(String arg[]){

        Comparator<Integer> cmp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };


        //Collection<Integer> nums = new ArrayList<Integer>(); // we cant use indexing in collection bbut we can do in list
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(55);
        nums.add(16);
        nums.add(71);
        nums.add(32);


        System.out.println(nums.indexOf(5));
        System.out.println(nums.get(2));

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(nums, cmp);

        System.out.println(nums);

    }
}
