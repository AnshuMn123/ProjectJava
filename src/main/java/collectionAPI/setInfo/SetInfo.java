package collectionAPI.setInfo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInfo {
    public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("aa");
        hash_Set.add("bb");
        hash_Set.add("cc");
        hash_Set.add("dd");
        hash_Set.add("ee");

        System.out.println(hash_Set);

        Iterator<String> values = hash_Set.iterator();
        while(values.hasNext()){
            System.out.println(values.next() + " : " + values.hashCode());
        }

    }
}
