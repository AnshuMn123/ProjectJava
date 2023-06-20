package collectionAPI.sortedSetInfo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetInfo{
    public static void main(String[] args) {
        SortedSet<String> ts   = new TreeSet<String>();
        ts.add("South Africa");
        ts.add("India");
        ts.add("Australia");
        ts.add("India");

        System.out.println(ts);

        ts.remove("Australia");
        System.out.println("Set after removing  " + ts);

        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
