package collectionAPI.dequeueInfo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInfo {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        int first = dq.removeFirst();
        int last = dq.removeLast();
        System.out.println("First: " + first + ", Last: " + last);

        dq.push(5);
        dq.offer(6);
        System.out.println("First: " + dq.getFirst() + ", Last: " + dq.getLast());

    }
}
