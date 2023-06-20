package collectionAPI.setInfo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String args[]) {
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));


        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union " + union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection " + intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference " + difference);


        a.add(10);
        System.out.println(a);

        System.out.println("checking for 10 " + a.contains(10));

        a.remove(2);
        System.out.println(a);

        for (int value : a)
            System.out.print(value + "  ");
    }
}
