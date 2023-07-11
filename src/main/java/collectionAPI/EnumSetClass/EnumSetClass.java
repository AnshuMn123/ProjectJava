package collectionAPI.EnumSetClass;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetClass {
    public static void main(String[] args) {
        EnumSet<Size> eset = EnumSet.allOf(Size.class); // it will take all enum
        EnumSet<Size> eset1 = EnumSet.noneOf(Size.class); // it will not take any enum
        EnumSet<Size> eset2 = EnumSet.range(Size.MEDIUM, Size.LARGE); // it will take in range from medium to large
        EnumSet<Size> eset3 = EnumSet.of(Size.SMALL, Size.EXTRALARGE); // it will only given value like small and exlarge
        eset3.add(Size.LARGE); // we can add like these also

        Iterator<Size> it = eset3.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE,
}
