package Merge_sort;

import java.util.Arrays;

public class sorting_practice {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }
    static void selection(int [] arr){

    }

    static void swap (int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

