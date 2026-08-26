package CollectionFramework;

import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Vectors {
    static void main() {
        //vector or collection -> interface

        //Vector --> concrete class
//        List<Integer> arr = new Vector<>();
//        Collection<Integer> arr = new Vector<>();

        Vector<Integer> vector = new Vector<>();
        //add
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector);
        vector.add(40);
        System.out.println(vector);

        //remove
        vector.remove(0);
        System.out.println(vector);

        //addAll
        List<Integer> vector2 = new Vector<>();
        vector2.add(101);
        vector2.add(102);

        vector.addAll(vector2);
        System.out.println(vector);

        //removeall
        vector.removeAll(vector2);
        System.out.println(vector);

        //size
        System.out.println(vector.size());

        //clear
        System.out.println(vector2);
        vector2.clear();
        System.out.println(vector2);
        System.out.println(vector2.size());

        //iterator -- traverse vector
        Iterator<Integer> iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.println("element : " + iterator.next());
        }

        //get and set
        List<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);

        System.out.println(vector3.get(0));

        //set
        System.out.println("Before set : "+ vector3);
        vector3.set(0,100);
        System.out.println("After set : "+ vector3);

        //toArray
        Object[] arr = vector3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(vector3.contains(100));
        System.out.println(vector3.contains(101));

        //sort
        vector.add(60);
        vector.add(10);
        vector.add(3);
        System.out.println("Entire vector : "+ vector);

        //sort
        Collections.sort(vector);
        System.out.println("Sorted vector : "+ vector);

        //clone
        Vector<Integer> newList = (Vector<Integer>)vector.clone();
        System.out.println("New List  : " +newList);

        //ensureCapacity
        Vector<Integer> marks = new Vector<>();
        marks.ensureCapacity(100);

        //isEmpty()
        Vector<Integer> empty = new Vector<>();
        System.out.println(empty.isEmpty());

        //indexOf
        System.out.println(vector.indexOf(300));


    }
}
