package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String arg[]){
//        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l = Arrays.asList(3,4,5,6);

//        1. extended method of for each how it works

//        Consumer<Integer> con = new Consumer<Integer>() {
//            public void accept(Integer num) {
//                System.out.println(num);
//
//            }
//        };

//        change it into lamda function
        Consumer<Integer> con =  num -> System.out.println(num);

        // after this we can  use con value or we can directly use right side  things
        l.forEach(n -> System.out.println(n));

    }
}
