package collectionAPI.setInfo;

import java.util.EnumSet;
import java.util.Set;

enum Status { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;
public class EnumSetInfo {
    public static void main(String[] args) {
        Set<Status> set1 = EnumSet.of(Status.QUIZ, Status.CONTRIBUTE,
                Status.LEARN, Status.CODE);

        System.out.println("Set : " + set1);
    }
}

