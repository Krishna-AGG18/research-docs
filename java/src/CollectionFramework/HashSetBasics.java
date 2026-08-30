package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    static void main() {
        Set<Integer> set1  = new HashSet<>();
        Set<Integer> set2  = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        System.out.println(set1);

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        System.out.println(set2);

        //RETAINALL ---> INTERSECTION OF SET1 AND ASET 2 IS STORED IN SET1
        System.out.println("SET1 BEFORE : "+set1);
        set1.retainAll(set2);
        System.out.println("SET1 after : "+set1);
        System.out.println("Set 2 : "+set2);

        System.out.println("Contains all set1 and set 2 : " + set1.containsAll(set2));
        System.out.println("Contains all set2 and set 1 : " + set2.containsAll(set1));

    }
}
