package Arena_1D;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class Leetcode_Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] myArr = new int[m][n];
        int [][] indices = {
                {0,1},
                {1,1}
        };
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int [][] arr = new int[m][n];
        for (int r = 0; r < indices.length; r++) {
            for (int c = 0; c < indices[r].length; c++) {
                int temp = indices[r][c];
                if (c==0){
                    int k = 0;
                    while (k < arr[temp].length){
                        arr[temp][k] += 1;
                        k++;
                    }
                }
                if (c==1){
                    int i = 0;
                    while (i < arr.length){
                        arr[i][temp] += 1;
                        i++;
                    }
                }
            }
        }
        int counter = 0;
        for (int ar [] : arr){
            for (int e : ar){
              if (e % 2!=0){
                  counter++;
              }
            }
        }
        return counter;
    }
}
