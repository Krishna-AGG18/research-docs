package CollectionFramework;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    static void main() {
        // 3 ways to create
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> dq = new ArrayDeque<>(); // to use deque functions change reference type to Deque as well...
        Queue<Integer> pq = new PriorityQueue<>();

        //additon
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.offer(50);
        System.out.println("Queue : "+q);

        //remove
        System.out.println("Poll : "+q.poll());
        System.out.println("Queue : "+q);

        //peek
        System.out.println("Peek : "+q.peek());


    }
}
