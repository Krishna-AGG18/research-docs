package ArrayProblemsBasics;

import java.util.HashMap;

public class ArrayProblemsFour {

    static int[] twoSum(int[] arr, int target){
        int n = arr.length-1;
        int ans[] = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <=n; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }

    static int firstRepeatingNum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > 1 ){
                return key;
            }
        }

        return 0;
    }
    static void main() {
        //two sum
        int[] arr = {1,2,3,4,5,6};
        int ans[] = twoSum(arr,10);

        for(int num : ans){
            System.out.println(num);
        }

        // first repeating
        int array[] = {2,4,6,8,7,6,8};
        System.out.println(firstRepeatingNum(array));
    }
}
