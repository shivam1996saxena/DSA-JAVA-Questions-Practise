package Assignments_2D_Array;

import java.util.Scanner;

public class Boundary_Traversal_of_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        while (testcase != 0) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            boolean case1 = false;
            int[][] matrix = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            if (row > 1 && column > 1) {
                int lastIndex = column - 1;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        if (i == 0 || j == 0 || i == row - 1 || j == column - 1) {
                            if (i == 0) {
                                System.out.print(matrix[i][j] + " ");
                            } else if ((i != row - 1 && i > 0) && (j == 0)) {
                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[i][matrix[i].length - 1];
                                matrix[i][matrix[i].length - 1] = temp;
                                System.out.print(matrix[i][j] + " ");
                            }
                            if (i == row - 1 && i > 0 && column > 1) {
                                int k = matrix[i].length - 1;
                                while (k > 0) {
                                    if (lastIndex >= 0) {
                                        System.out.print(matrix[i][lastIndex] + " ");
                                        case1 = true;
                                    }
                                    lastIndex--;
                                    k--;
                                }
                            }
                        }
                    }
                }
                if (case1) {
                    for (int i = row - 2; i > 0; i--) {
                        System.out.print(matrix[i][matrix[i].length - 1] + " ");
                    }
                }
            } else for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            testcase--;
            System.out.println();
        }
    }
}
//    Problem Statement
//    You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
//        Input
//        The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= n, m <= 30
//        0 <= A[i][j] <= 100
//        Output
//        For each testcase, in a new line, print the boundary traversal of the matrix A.
//        Example
//        Input:
//        4
//        4 4
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//        3 4
//        12 11 10 9 8 7 6 5 4 3 2 1
//        1 4
//        1 2 3 4
//        4 1
//        1 2 3 4
//
//        Output:
//        1 2 3 4 8 12 16 15 14 13 9 5
//        12 11 10 9 5 1 2 3 4 8
//        1 2 3 4
//        1 2 3 4
//
//        Explanation:
//        Testcase1: The matrix is:
//        1 2 3 4
//        5 6 7 8
//        9 10 11 12
//        13 14 15 16
//        The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
//        Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
//        Testcase 3: Boundary Traversal will be 1 2 3 4.
//        Testcase 4: Boundary Traversal will be 1 2 3 4.