package collectionAPI;


import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        System.out.println(arr[0]);

        Vector<Integer> v = new Vector();
        v.addElement(2);
        v.addElement(3);
        System.out.println(v.elementAt(0));

        Hashtable<Integer, String> h = new Hashtable();
        h.put(1, "1geeks");
        h.put(2, "1geeks");
        System.out.println(h.get(1));
    }
}
