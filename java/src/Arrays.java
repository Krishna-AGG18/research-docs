import java.util.Scanner;

public class Arrays {
    static void main() {
        //decalration
        int arr [];
        // allocation
        arr = new int[5];
        //init
        int brr [] = {10,2,3};
//        System.out.println("value at index 0 : "+brr[0]);

        int n = brr.length;

        //looping the array
        for (int i = 0; i < n; i++){
//            System.out.println(brr[i]);
        }

        //foreach loop
        for(int num : brr){
//            System.out.println(num);
        }

        //taking input in an array
        Scanner sc = new Scanner(System.in);

        int n2 = arr.length;

        for(int i = 0; i < n2; i++){
            System.out.print("provide input for index "+i + " : ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
