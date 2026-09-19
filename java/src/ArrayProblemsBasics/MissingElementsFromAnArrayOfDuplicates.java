package ArrayProblemsBasics;
import java.util.*;
public class MissingElementsFromAnArrayOfDuplicates {
    static List<Integer> findDisappearedNum(int[] nums){
        int n = nums.length;
        //marking
        for(int i = 0; i < n ; i++){
            int value = Math.abs(nums[i]);
            int pos = value-1;
            if(nums[pos] > 0){
                nums[pos] = -nums[pos];
            }
        }

        //traverse and get if its the mised one ??
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }

        return result;
    }

    static void main() {
        int [] arr = {1,4,4,5,2,2};
        List<Integer> list = findDisappearedNum(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
