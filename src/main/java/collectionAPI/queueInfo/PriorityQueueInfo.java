package collectionAPI.queueInfo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueInfo {
    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("aa");
        pq.add("bb");
        pq.add("cc");
        System.out.println("Initial Queue " + pq);

        pq.remove("aa");
        System.out.println("After Remove " + pq);

        System.out.println("Poll Method : " + pq.poll()); // give front or top in queue
        System.out.println("Final Queue " + pq);


        pq.add("dd");
        pq.add("ee");
        pq.add("ff");
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
