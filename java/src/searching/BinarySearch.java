package searching;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]== target ){
                return true;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }

        return false;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        if(binarySearch(arr,3)){
            System.out.println("true target exist....");
        }else {
            System.out.println("target does not exist");
        }
    }
}
