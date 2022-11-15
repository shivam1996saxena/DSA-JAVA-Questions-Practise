package Merge_sort;

import java.util.Arrays;

public class Maximum_difference_array {
    public static void main(String[] args) {
        int [] arr = {5,9,2,0,4,3,2,6,1};
        System.out.println(maxIndexDiff(arr,arr.length));
    }
    static int max(int x, int y){
        return x > y ? x : y;
    }
    static int min(int x, int y){
        return x > y ? y : x;
    }
    static int maxIndexDiff(int [] arr, int n){
        int maxDiff;
        int i, j;
        int [] rightMax = new int[n];
        int [] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (i= 1; i < n; i++) {
            leftMin[i] = min(arr[i],leftMin[i-1]);
        }
        rightMax[n-1] = arr[n-1];
        for (j = n-2;j >= 0; j--) {
           rightMax[j] = max(arr[j],rightMax[j+1]);
        }
        i = 0;
        j = 0;
        maxDiff = -1;
        while (i < n && j < n){
            if (leftMin[i] < rightMax[j]){
                maxDiff = max(maxDiff,j-i);
                j++;
            }
            else i++;
        }
        return maxDiff;
    }
}
