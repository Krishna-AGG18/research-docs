package sorting;

public class SortingAlgo {
    static void bubblesort(int[] arr) { // -------> O(n^2)
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { //number of rounds
            for (int j = 0; j < n - i - 1; j++) { //for comaprision of neighbouring elems
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionsort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n ; i++){
            int curval = arr[i];
            int prev = i-1;

            //shifting
            while(prev >=0 && curval < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //a expty space is there
            arr[prev+1] = curval;
        }
    }

    static void mergesort(int[] arr) {

    }

    static void selectionsort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


    }

    static void main() {
        int[] arr = {6, 5, 1, 3, 2, 4};
//        bubblesort(arr);
//        selectionsort(arr);
        insertionsort(arr);
        System.out.println("Printing the array : ");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
