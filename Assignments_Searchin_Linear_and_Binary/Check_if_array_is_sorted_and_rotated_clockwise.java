package Assignments_Searchin_Linear_and_Binary;

import java.util.Scanner;

public class Check_if_array_is_sorted_and_rotated_clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            boolean isRotated = false;
            int increment = 0;
            int decrement = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]<=arr[i+1]){
                    increment++;
                }
                else if (arr[i]>=arr[i+1]){
                    decrement++;
                }
            }
            if (increment==1&&decrement!=1){
                if (arr[n-1]<arr[0]){
                    System.out.println("No");
                    testcase--;
                    continue;
                }
            }
            if (decrement==1&&increment!=1){
                if(arr[n-1]>arr[0]){
                    System.out.println("No");
                    testcase--;
                    continue;
                }
            }
            if (increment==1&&decrement>1){
                isRotated = true;
            }
            if (decrement==1&&increment>1){
                isRotated = true;
            }
            if (decrement==1&&increment==1){
                isRotated = true;
            }
            if (isRotated){
                System.out.println("Yes");
            }
            else System.out.println("No");
            testcase--;
        }
    }
}
//    Problem Statement
//    Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise.
//        A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.
//
//        Note:-Array can be sorted both increasingly and decreasingly
//        Input
//        The first line of input contains number of testcases T. Each testcase contains 2 lines, the first line contains N, the number of elements in array, and second line contains N space separated elements of array.
//
//        Constraints:
//        1 <= T <= 50
//        3 <= N <= 10^3
//        1 <= A[i] <= 10^4
//        Output
//        Print "Yes" if the given array is sorted and rotated, else Print "No", without Inverted commas.
//        Example
//        Sample Input:
//        2
//        4
//        3 4 1 2
//        3
//        1 3 2
//        Sample Output:
//        Yes
//        Yes
//        Explanation:
//        Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
//        Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).