package Assignments_2D_Array;

import java.util.Scanner;

public class A_Boolean_Matrix_Problem_Sol_1 {
    public static void main(String[] args) {

    }
    static void method1(){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        while (testcase>0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] matrix = new int[n][m];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[row][col] = scanner.nextInt();
                }
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col]==1){
                        int i = matrix[row].length-1;
                        while (i>=0){
                            matrix[row][i]=1;
                            i--;
                        }
                    }
                }
            }
            for (int [] e : matrix) {
                for (int element : e) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            testcase--;
        }
    }
}

//    Problem Statement
//    You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
//        Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.
//        Input
//        The first line of input contains T denoting the number of testcases. T testcases follow.
//        The first line of each testcase contains m and n denoting number of rows and number of columns.
//        Then next m lines contain n elements denoting the elements of the matrix.
//
//        Constraints:
//        1 <= T <= 20
//        1 <= m, n <= 700
//        Mat[I][j] ∈ {0,1}
//        Output
//        For each testcase, in a new line, print the modified matrix.
//        Example
//        Input:
//        2
//        5 4
//        1 0 0 0
//        0 0 0 0
//        0 1 0 0
//        0 0 0 0
//        0 0 0 1
//        1 2
//        0 0
//
//        Output:
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
//        0 0
//
//        Explanation:
//        Testcase1: rows = 5 and columns = 4
//        The given matrix is
//        1 0 0 0
//        0 0 0 0
//        0 1 0 0
//        0 0 0 0
//        0 0 0 1
//        Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
//        The final matrix is
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1
//        0 0 0 0
//        1 1 1 1