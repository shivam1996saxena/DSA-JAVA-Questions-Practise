package Assignments_2D_Array;

import java.util.Scanner;

public class Simple_Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        // input of matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix [row][col] = scanner.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        for (int row = i; row < matrix.length; row++) {
            for (int col = j; col < matrix[row].length; col++) {
                if (row!=col) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
            i++;
            j++;
        }
        // printing the matrix
        for (int [] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
//    Problem Statement
//    You are given a NxN matrix. You need to find the transpose of the matrix.
//        The matrix is of form:
//        a b c ...
//        d e f ...
//        g h i ...
//        ...........
//        There are N elements in each row.
//        Input
//        The first line of the input contains an integer N denoting the size of the square matrix.
//        The next N lines contain N single-spaced integers.
//
//        Constraints
//        1 <= N <= 100
//        1 <=Ai <= 100000
//        Output
//        Output the transpose of the matrix in similar format as that of the input.
//        Example
//        Sample Input
//        2
//        1 3
//        2 2
//
//        Sample Output
//        1 2
//        3 2
//
//        Sample Input:
//        1 2
//        3 4
//
//        Sample Output:
//        1 3
//        2 4