package Assignments_Sorting;

import java.util.Scanner;

public class Implementing_Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase!=0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<arr.length-1;i++){
                for (int j=i+1;j>0;j--){
                    if (arr[j-1]>arr[j]){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(int e : arr){
                System.out.print(e + " ");
            }
            System.out.println();
            testcase--;
        }
    }
}
