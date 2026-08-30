package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeBasics {
    static void main() {
        Deque<Integer> dq = new ArrayDeque<>();
        //add
        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        dq.offerFirst(1);
        dq.offerLast(100);
        System.out.println("Deque : "+dq);

        //remove or poll
        dq.pollLast();
        System.out.println("Polled last deque : " + dq);
        dq.pollFirst();
        System.out.println("Polled first deque : " + dq);

        //size
        System.out.println("Size : "+ dq.size());

        //peek
        System.out.println("peek normal : "+dq.peek());
        System.out.println("peek first : "+dq.peekFirst());
        System.out.println("peek last : "+dq.peekLast());

    }
}
