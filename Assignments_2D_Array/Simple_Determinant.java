package Assignments_2D_Array;

import java.util.Scanner;

public class Simple_Determinant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        int [] [] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix [i] [j] = scanner.nextInt();
            }
        }
        int determinant = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
        System.out.println(determinant);
    }
}
//    Problem Statement
//    You are given a 2X2 square matrix. You need to find the determinant of the matrix.
//        Input
//        The input contains two-line, each line contain two integers separated by spaces.
//
//        Each element of the matrix is from 1 to 100.
//        Output
//        Output a single integer, the determinant of the matrix.
//        Example
//        Sample Input
//        4 5
//        2 3
//
//        Sample Output
//        2
//
//        Sample Input
//        2 10
//        10 40
//
//        Sample Output
//        -20
