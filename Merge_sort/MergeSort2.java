package Merge_sort;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int [] arr = {3,2,1};
        System.out.print(Arrays.toString(implementationMergeSort(arr, 0, 2)));
    }
    static int [] implementationMergeSort(int [] arr,int s, int e){
        if (s == e){
            return arr;
        }
        int m = s + (e-s)/2;
        implementationMergeSort(arr,s,m);
        implementationMergeSort(arr,m+1,e);
        merge(arr, s, m, m + 1, e);
        return arr;
    }

    private static void merge(int[] arr, int s, int m, int s2, int e) {
        int [] mix = new int[(m-s+1)+(e-s2+1)];
        int i = s;
        int j = s2;
        int k = 0;
        while (i <= m && j <= e){
            if (arr[i] <= arr[j]){
                mix [k] = arr[i];
                i++;
            }
            else {
                mix [k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m){
            mix [k] = arr[i];
            i++;
            k++;
        }
        while (j <= e){
            mix [k] = arr[j];
            j++;
            k++;
        }
        k = 0;
        for (int l = s; l <= e; l++) {
            arr[l] = mix [k];
            k++;
        }
    }
}
