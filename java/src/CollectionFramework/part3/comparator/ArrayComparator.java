package CollectionFramework.part3.comparator;

import java.util.Arrays;

public class ArrayComparator {
    static void main(String[] args) {
        Integer[] arr = {1,3,2,4,7,5,6,0};
        //Arrays.sort(arr); // --> ascending order
        Arrays.sort(arr, new ReverseComparator());
        for(int a : arr){
            System.out.println(a);
        }

    }
}
