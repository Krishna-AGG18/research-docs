public class Arrays2 {
    static void main() {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        int n = arr.length;

        //loop to sum element sum of elements
        for(int i = 0; i < n ; i++ ){
            sum+= arr[i];
        }
        System.out.println("Sum of array element is : "+sum);

        //loop to print multiple of all elements
        int prod = 1;
        for(int i = 0; i<n; i++){
            prod *= arr[i];
        }
        System.out.println("Product of arrays elements : "+ prod);

        //max element in the array
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
//            max = Integer.max(max,arr[i]);
        }
        System.out.println("Max value in the array is : "+max);

        //min value in the array
        int min = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
//            min = Integer.min(min,arr[i]);
        }
        System.out.println("Min value in the array is : "+min);

    }
}
