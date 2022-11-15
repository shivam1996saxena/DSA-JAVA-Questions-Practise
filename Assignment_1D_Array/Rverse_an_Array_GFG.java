package Assignment_1D_Array;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/reverse-an-array/0
public class Rverse_an_Array_GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int testcase = sc.nextInt();
        while (testcase != 0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int k = 0; k < n; k++){
                arr[k] = sc.nextInt();
            }
            int i = 0;
            int j = n-1;
            while (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            for(int k = 0; k < n; k++){
                System.out.print(arr[k] + " ");
            }
            testcase--;
        }
    }
}