package Arena_1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Strings_Sorting_Dictionary_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] names = new String[n];
        for (int i = 0; i < n; i++) {
            names [i] = sc.next();
        }
        sort(names);
        for(String ele : names){
            System.out.print(ele + " ");
        }
    }
    static void sort(String [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
