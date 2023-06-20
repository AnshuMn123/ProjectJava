package collectionAPI.list;

import java.util.List;
import java.util.Vector;

public class VectorInfo {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> v = new Vector<Integer>(n);

        // Appending the new elements at the end of the list
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
        System.out.println(v);

        v.remove(3); // Remove element at index 3
        System.out.println(v); // Displaying the list after deletion

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
