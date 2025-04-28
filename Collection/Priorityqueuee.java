package Collection;

import java.util.PriorityQueue;

public class Priorityqueuee {
    
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(34);
        pq.offer(566);
        pq.offer(56);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    
}
