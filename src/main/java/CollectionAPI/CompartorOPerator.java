package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorOPerator {
    public static void main(String arg[]){

        Comparator<Integer> cmp = (Integer i, Integer j) -> i%10 > j%10 ? 1 : -1;

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(55);
        nums.add(16);
        nums.add(71);
        nums.add(32);


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

