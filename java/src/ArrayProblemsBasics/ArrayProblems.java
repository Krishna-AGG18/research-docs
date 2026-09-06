package ArrayProblemsBasics;

import java.lang.classfile.constantpool.InterfaceMethodRefEntry;
import java.util.HashSet;

public class ArrayProblems {

    static double getAverage(int[] arr){
        int sum = 0;
        //time complexity - O(n)
        for(int num : arr){
            sum+= num;
        }
        int size = arr.length;
        double avg = (double) sum/size;
        return avg;
    }

    static int[] multiplyByTen(int[] arr){
        int new_arr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            new_arr[i] = arr[i] *10;
        }

        return new_arr;
    }

    static boolean linearSearch(int arr[], int target){
        for(int num : arr){
            if(num == target){
                return true;
            }
        }
        return false;
    }

    static int getMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if (num > max){
                max = num;
            }
//            max = Math.max(num,max);
        }
        return max;
    }

    static int[] SumPositiveNegative(int arr[]){
        int pos=0;
        int neg=0;

        for(int num : arr){
            if(num > 0){
                pos +=num;
                continue;
            }
            neg+=num;
        }
        int[] res = {pos,neg};
        return res;
    }

    static int[] countZeroOne(int arr[]){
        int zero=0;
        int one=0;

        for(int num : arr){
            if(num == 0){
                zero ++;
                continue;
            }
            one++;
        }
        int[] res = {zero,one};
        return res;
    }

    static int getFirstUnsortedElem(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return arr[i];
            }
        }

        return -1;
    }

    static void swapAltElement(int [] arr){
        for(int i = 0; i < arr.length; i = i+2){
            arr[i] = arr[i+1]^arr[i];
            arr[i+1] = arr[i+1]^arr[i];
            arr[i] = arr[i+1]^arr[i];
        }
    }

    static void intersectionArray(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num :  arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                System.out.println(num);
                set.remove(num);
            }
        }
    }

    static void alternateExtremes(int [] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <j){
            System.out.println(arr[i] + " " + arr[j]);
            i++;
            j--;
        }
    }


    static void main(String[] args) {
        int arr[] = {2,4,3,3,3};

        //average
        System.out.println("Avergae of elements : " + getAverage(arr));

        //multiply
        System.out.print("Multiply each element by 10 : ");
        for(int num : multiplyByTen(arr)){
            System.out.print(num + " ");
        }
        System.out.println();

        //linearsearch
        System.out.println("Is 7 there in array : "+linearSearch(arr,7));
        System.out.println("Is 3 there in array : "+linearSearch(arr,3));

        //max element
        System.out.println("Max element in the array is : " + getMax(arr));

        //pos,negative sum
        int arr2[] = {1,-2,3,-4,5,-6};
        System.out.println("Positive sum : " + SumPositiveNegative(arr2)[0]);
        System.out.println("Negative sum : " + SumPositiveNegative(arr2)[1]);

        //count zeroes and one
        int arr3[] = {1,0,1,1,0,1,1,1};
        System.out.println("Zero count : " + countZeroOne(arr3)[0]);
        System.out.println("One count : " + countZeroOne(arr3)[1]);

        //get first unsorted elem
        int arr4[] = {1,2,3,4};
        System.out.println("First unsorted elem : " + getFirstUnsortedElem(arr4));

        //swap alternate elements
        swapAltElement(arr4);
        for(int num : arr4){
            System.out.print(num + " ");
        }
        System.out.println();

        //intersection of elements
        intersectionArray(arr2, arr4);

        //alternate extremes
        alternateExtremes(arr4);

    }
}
