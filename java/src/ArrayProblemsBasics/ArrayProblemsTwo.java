package ArrayProblemsBasics;

public class ArrayProblemsTwo {
    //sort os and 1s
    static void sort0And1(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }

    //missing numbers
    static int missingNumber(int[] arr){
        int xor = 0;

        for(int i = 0; i <= arr.length; i++){
            xor ^= i;
        }
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }
        return xor;
    }

    static int uniqueElement(int[] arr){
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }

    static void main() {
        int arr[] = {1,0,1,1,0,0,1};
        sort0And1(arr);
//        for(int num : arr){
//            System.out.println(num);
//        }

        int arr2[] = {0,1,2,3,4,5};
        System.out.println(missingNumber(arr2));

        int arr3[] = {1,1,2,3,3,2,4};
        System.out.println(uniqueElement(arr3));
    }
}
