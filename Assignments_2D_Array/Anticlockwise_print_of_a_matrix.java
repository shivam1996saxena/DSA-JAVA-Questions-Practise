package Assignments_2D_Array;

import java.util.Scanner;

public class Anticlockwise_print_of_a_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        anticlockwise(arr,n,m);
    }
    static void anticlockwise(int [][] arr, int row, int col){
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;
        int total = row*col;
        int counter = 0;
        while (counter < total){
            if (counter < total) {
                for (int i = minCol; i <= maxCol; i++) {
                    System.out.print(arr[minRow][i] + " ");
                    counter++;
                }
                minRow++;
            }
            if (counter < total) {
                for (int i = minRow; i <= maxRow; i++) {
                    System.out.print(arr[i][maxCol] + " ");
                    counter++;
                }
                maxCol--;
            }
            if (counter < total) {
                for (int i = maxCol; i >= minCol; i--) {
                    System.out.print(arr[maxRow][i] + " ");
                    counter++;
                }
                maxRow--;
            }
            if (counter < total) {
                for (int i = maxRow; i >= minRow; i--) {
                    System.out.print(arr[i][minCol] + " ");
                    counter++;
                }
                minCol++;
            }
        }
    }
}
