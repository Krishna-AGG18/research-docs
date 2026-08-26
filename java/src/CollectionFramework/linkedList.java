package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    static void main() {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(10);
        linkedlist.add(30);
        linkedlist.add(10);
        linkedlist.add(40);
        linkedlist.add(10);
        linkedlist.add(40);

        System.out.println("Original list : "+linkedlist);
        System.out.println("Index of last occurence of 10 : "+linkedlist.lastIndexOf(10));

        linkedlist.remove(2);
        linkedlist.remove(3);
        linkedlist.remove(4);
        linkedlist.remove(4);
        System.out.println("Original list : "+linkedlist);

        //addfirst
        linkedlist.addFirst(1);
        //addlast
        linkedlist.addLast(100);
        System.out.println("Original list : "+linkedlist);

        //remoce first
        linkedlist.removeFirst();
        //remove last
        linkedlist.removeLast();
        System.out.println(linkedlist);

        //getfirst
        System.out.println(linkedlist.getFirst());
        //getlast
        System.out.println(linkedlist.getLast());

        //peek
        System.out.println(linkedlist.peek());

        //poll -return and remove first
        System.out.println("before poll : " + linkedlist);
        System.out.println("poll : " + linkedlist.poll());
        System.out.println("after poll : " + linkedlist);

        //offer
        linkedlist.offer(1000);
        System.out.println(linkedlist);
    }
}
