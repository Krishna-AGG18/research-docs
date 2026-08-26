package CollectionFramework;
import java.util.*;

public class Main {
    static void main() {
        //list or collection -> interface

        //Arraylist --> concrete class
//        List<Integer> arr = new ArrayList<>();
//        Collection<Integer> arr = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);

        list.addAll(list2);
        System.out.println(list);

        //removeall
        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //clear
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
        System.out.println(list2.size());

        //iterator -- traverse list
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("element : " + iterator.next());
        }

        //get and set
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        System.out.println(list3.get(0));

        //set
        System.out.println("Before set : "+ list3);
        list3.set(0,100);
        System.out.println("After set : "+ list3);

        //toArray
        Object[] arr = list3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(100));
        System.out.println(list3.contains(101));

        //sort
        list.add(60);
        list.add(10);
        list.add(3);
        System.out.println("Entire list : "+ list);

        //sort
        Collections.sort(list);
        System.out.println("Sorted list : "+ list);

        //clone
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("New List  : " +newList);

        //ensureCapacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        //isEmpty()
        ArrayList<Integer> empty = new ArrayList<>();
        System.out.println(empty.isEmpty());

        //indexOf
        System.out.println(list.indexOf(300));


    }
}
