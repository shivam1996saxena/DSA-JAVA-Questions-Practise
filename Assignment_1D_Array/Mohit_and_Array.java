package Assignment_1D_Array;

import java.util.Scanner;

public class Mohit_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0;i < n-1;i++){
            array[i] = sc.nextInt();
        }
        for (int j = 1;j<=n;j++){
            boolean jExists = false;
            for (int i=0;i<n-1;i++){
                if (array[i]==j){
                    jExists = true;
                    break;
                }
            }
            if (!jExists){
                System.out.println(j);
                break;

            }
        }
    }
}
//    Problem Statement
//    Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
//        Given N-1 elements your task is to find the missing one.
//        Input
//        First line of input contains a single integer N, the next line contains N-1 space separated integers.
//
//        Constraints:-
//        1 < = N < = 1000
//        1 < = elements < = N
//        Output
//        Print the missing element
//        Example
//        Sample Input:-
//        3
//        3 1
//
//        Sample Output:
//        2
//
//        Sample Input:-
//        5
//        1 4 5 2
//
//        Sample Output:-
//        3