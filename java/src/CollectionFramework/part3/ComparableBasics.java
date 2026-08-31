package CollectionFramework.part3;

import java.util.ArrayList;
import java.util.*;

public class ComparableBasics {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(67);
        list.add(3);
        System.out.println("List is : " + list);

        Collections.sort(list);
        System.out.println("Sorted List is : " + list);

    }
}
