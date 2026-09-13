package ArrayProblemsBasics;

import java.lang.classfile.constantpool.InterfaceMethodRefEntry;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayProblems {

    static int getMode(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) +1);
        }

        int mode = -1;
        int modeKey = -1;

        for(int key : map.keySet()){
            int currKey = key;
            int currKeyValue = map.get(key);

            if(currKeyValue > mode){
            mode = Math.max(mode,currKeyValue);
            modeKey = currKey;
            }
        }

        return modeKey;
    }

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

    static int[]  getHighLowFreq(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        int highFreq = Integer.MIN_VALUE;
        int highKey = -1;
        int lowFreq = Integer.MAX_VALUE;
        int lowKey = -1;

        for(int key : freq.keySet()){
            int currValue = freq.get(key);

            if(currValue > highFreq){
                highFreq = currValue;
                highKey = key;
            }

            if(currValue < lowFreq){
                lowFreq = currValue;
                lowKey = key;
            }
        }

        return new int[]{lowKey,highKey};
    }

    static int[] unionOfArrays(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }

        int [] ans = new int[set.size()];
        int i = 0;
        for(int num : set){
            ans[i++] = num;
        }

        return ans;
    }

    static void rotateByK(int arr[], int k){
        k = k % arr.length;
        int temp[] = new int[k];
        int len = arr.length - 1;

        //store last k elements temporary
        for(int i = 0 ; i < temp.length; i++){
            temp[i] = arr[len - i];
        }

        //move elements forward
        for(int i = len; i >= k; i--){
            arr[i] = arr[i-k];
        }

        for(int i = 0; i < k; i++){
            arr[i] = temp[k-i-1];
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

        //mode of array - return the key (element)
        int[] mode = {2,3,3,3,3,3,3,4,5,6,7,1,2,1,2,1,2,1,2,1};
        System.out.println(getMode(mode));

        int[] freq = getHighLowFreq(mode);

        System.out.println("Lowest freq : " + freq[0] + " , Highest freq : " + freq[1]);


        //union of arrays
        int union1[] = {1,2,3,4,5};
        int union2[] = {2,3,4,5,7};

        int union[] = unionOfArrays(union1, union2);
        for(int num : union){
            System.out.println(num);
        }

        //swap by k
        int swap[] = {1,2,3,4,5,6,7,8,9,10};
        rotateByK(swap,2);

        System.out.println();
        for(int num : swap){
            System.out.print(num + " ");
        }
    }
}
