package Assignments_Searchin_Linear_and_Binary;

import java.util.Scanner;

public class Find_Positions__of_X_in_array {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int testcase = c.nextInt();
        while (testcase!=0) {
            int n = c.nextInt();
            int element = c.nextInt();
            boolean elementExists = false;
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = c.nextInt();
            }
            for (int i=0;i<n;i++){
                if (arr[i]==element){
                    elementExists = true;
                    System.out.print(i + " ");
                }
            }
            if (!elementExists){
                System.out.print("Not found");
            }
            System.out.println();
            testcase--;
        }
    }
}
//    Problem Statement
//    Given an integer array arr[] of size N and an element X. The task is to find and print the indices of the given element if it is present in array if not then print “Not found” without quotes.
//
//        Note: The elements may be present more than once.
//        Input
//        The first line of input contains T, denoting the number of test cases.
//        The first line of each test case contains N and X, N is the size of array and X is an element. Second line contains elements of array space separated. If not present then print "Not found" without quotes
//
//        Constraints:
//        1 <= T <= 100
//        1 <= N, X <= 10000
//        1 <= arr[i] <= 100000
//        Output
//        For each test case in new line you need to print all the positions where you find the X separated by space.
//        Assume 0-indexing
//        Example
//        Input:
//        2
//        5 6
//        2 3 6 5 6
//        4 3
//        2 4 6 5
//
//        Output:
//        2 4
//        Not found