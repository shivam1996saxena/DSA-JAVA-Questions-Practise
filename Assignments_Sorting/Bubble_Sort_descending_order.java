package Assignments_Sorting;

import javax.print.attribute.HashDocAttributeSet;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort_descending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        arrayInput(array);
        bubbleDescending(array);
        printArray(array);
    }
    static void arrayInput(int [] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void bubbleDescending(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
              if (arr[j]>arr[j-1]){
                 swap(arr,j,j-1);
              }
            }
        }
    }
    static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void printArray(int [] arr){
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
