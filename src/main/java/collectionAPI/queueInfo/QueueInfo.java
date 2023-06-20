package collectionAPI.queueInfo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInfo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        System.out.println("Queue: " + queue);

        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after removal: " + queue);

        queue.add("date");
        System.out.println("Peeked element: " + queue.peek());
        System.out.println("Queue after peek: " + queue);



        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            q.add(i);

        System.out.println(q);
        System.out.println("removed element "  + q.remove());

        System.out.println(q);
        System.out.println("head of queue "  + q.peek());
        System.out.println("Size " + q.size());
    }
}
