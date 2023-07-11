package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        System.out.println(al);
        System.out.println();

        List<Integer> ls
                = al.stream() // 1. Getting the stream from this collection
                .filter(i -> i % 2 == 0) // 2. Filtering out only even elements
                .collect(Collectors.toList()); // 3. Collecting the required elements to List

        System.out.println(ls);
    }
}