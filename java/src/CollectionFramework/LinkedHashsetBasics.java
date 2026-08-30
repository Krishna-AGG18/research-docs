package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashsetBasics {
    static void main() {
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(40);
        ls.add(10);
        ls.add(20);
        ls.add(30);
        System.out.println("LinkedHashset preserves the order : "+ls);

        Set<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(10);
        ts.add(20);
        ts.add(30);
        System.out.println("Treeset returns sorted order : "+ts);
    }
}
