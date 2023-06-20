package collectionAPI.list;

import java.util.ArrayList;
import java.util.List;

public class ListInfo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);
        l1.add(2);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(3);
        System.out.println(l2);

        l1.addAll(1, l2); // Will add list l2 from 1 index
        System.out.println(l1);

        l1.remove(1); // Removes element from index 1
        System.out.println(l1);

        System.out.println(l1.get(2)); // Prints element at index 3 in list 1 using get() method

        l1.set(0, 5); // Replace 0th element with 5 in List 1
        System.out.println(l1);


        List<String> al = new ArrayList<>();
        al.add("aa");
        al.add("bb");
        al.add("cc");
        System.out.println(al.get(1));
        System.out.println(al);

        boolean isPresent = al.contains("bb");
        System.out.println("bb present in the list? " + isPresent);
    }
}
