package Assignments_Searchin_Linear_and_Binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Kth_smallest_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            diff(arr,k);
            testcase--;
        }
    }
    static void diff(int [] arr,int k){
        Arrays.sort(arr);
        int [] difference = new int [arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            difference[j] = Math.abs(arr[i]-arr[i+1]);
            j++;
        }
        System.out.println(difference[k]);
    }
}
