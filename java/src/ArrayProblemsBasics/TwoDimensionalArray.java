package ArrayProblemsBasics;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray {
    static List<Integer> rowSums(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int col = arr[i].length;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            list.add(sum);
        }

        return list;
    }

    static List<Integer> colSums(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int col = arr[i].length;
            for (int j = 0; j < col; j++) {
                sum += arr[j][i];
            }
            list.add(sum);
        }

        return list;
    }

    static List<Integer> wavePrint(int[][] arr, int m, int n) {
        List<Integer> result = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            if ((col & 1) != 0) {
                //its odd col go bottom to top
                for(int row = m - 1; row >=0; row--){
                    result.add(arr[row][col]);
                }
            } else {
                //its even col go top to bottom
                for(int row = 0; row < m; row++){
                    result.add(arr[row][col]);
                }
            }
        }

        return result;
    }

    static int[][] transpose(int[][] arr, int m, int n){
        int ans[][] = new int[n][m];

        for(int row = 0; row < m; row++){
            for(int col = 0 ; col < n ; col++){
                ans[col][row] = arr[row][col];
            }
        }

        return ans;
    }

    static void main() {
        //2d array
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //row sum
        List<Integer> ans = rowSums(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

        // colsum
        System.out.println("\nColumn Sum : \n");
        List<Integer> colsum = colSums(arr);
        for (int i = 0; i < colsum.size(); i++) {
            System.out.println(colsum.get(i));
        }

        //wave print
        System.out.println("\nWave : ");
        List<Integer> wave = wavePrint(arr,3,3);
        for (int i = 0; i < wave.size(); i++) {
            System.out.println(wave.get(i));
        }
        
        //transpose
        int[][] Transpose = transpose(arr,3,3);
        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
