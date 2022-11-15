package Assignments_Searchin_Linear_and_Binary;

import java.util.Scanner;

public class Counter_and_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sol(m,n,k);
    }
    static void sol(int m,int n,int k){
        int arr [] = new int[m];
        int i = 0;
        if (n==m){
            System.out.println(1);
            return;
        }
        while (n!=0){
            int start = 0;
            int p = 1;
            if (i == arr.length) {
                i = 0;
            }
            if (i!=0&&n<m){
                i = 0;
                int temp = n;
                while (temp!=0) {
                    arr[i] += p;
                    i++;
                    temp--;
                }
                n = 0;
            }
            if (n>=m) {
                arr[i] += p;
                start++;
                i++;
                n = n-start;
            }
        }
        System.out.println(arr[0]);
    }
}
