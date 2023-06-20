package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {
    public static void main(String arg[]){
        List<Integer> l = Arrays.asList(3,6,2,4,7,8,9);

//        Stream<Integer> s1 = l.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int s4 = s3.reduce(0, (c,e) -> c + e);

        int result = l.stream()
                    .filter(n-> n%2 == 0)
                    .map(n -> n*2)
                    .reduce(0, (c, e) -> c+e);

        System.out.println(result);

    }
}
