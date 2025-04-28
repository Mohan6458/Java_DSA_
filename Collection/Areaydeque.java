package Collection;

import java.util.ArrayDeque;

public class Areaydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ar = new ArrayDeque<>();
        ar.offer(23);
        ar.offer(534);
        ar.offer(56);
        ar.poll();

        System.out.println(ar);
    }
    
}
