package CollectionAPI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInfo {
    public static void main(String arg[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
//        Map<String, Integer> map = new Hashtable<String, Integer>(); // it is synchronized form of map

        map.put("H", 1);
        map.put("A", 2);
        map.put("C", 15);
        map.put("B", 12);
        map.put("F", 121);

        System.out.println(map.keySet());

        for(String name: map.keySet()){
            System.out.println(name + " : " + map.get(name));
        }
    }
}