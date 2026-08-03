import java.util.Scanner;

public class Array3 {
    static void main() {
        //declaration
        int arr[][] ;
        //allocation
        arr = new int[3][4];

        //input of a 2d array
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Input row " + (i+1) + " element " + (j+1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
arr.
        //print arr
        int rowlen = arr.length;
        int collen = arr[0].length;
        for(int i = 0; i<rowlen; i++){
            for(int j = 0; j < collen;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //init
//        int brr [][] = {
//                {1,2,3,4},{5,6,7,8},{9,10,11,12}
//        };
//
//        //first element
//        System.out.println("First element : "+brr[0][0]);
//
//        //print entire array
//        int rowlen = brr.length;
//        int collen = brr[0].length;
//        for(int i = 0; i<rowlen; i++){
//            for(int j = 0; j < collen;j++){
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        //jacked array
//        int crr [][] = {
//                {1,2},{5,6,7,8},{9,10,11}
//        };
//
//        int rIndex = crr.length;
//        for(int i = 0; i<rIndex; i++){
//            int cIndex = crr[i].length;
//            for(int j = 0; j < cIndex ;j++){
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
