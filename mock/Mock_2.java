package mock;

import java.util.Arrays;

public class Mock_2 {
    public static void main(String[] args) {
        int [] arr = {4,9,6,11,10};
        System.out.println(find(arr,9));
    }
    static void mergeInPlace (int [] arr, int start, int end){
        if (end - start == 1){
            return;
        }
         int mid = start + (end - start)/2;
        mergeInPlace(arr,start,mid);
        mergeInPlace(arr,mid,end);
       mergeIP(arr,start,mid,end);
    }
    private static int [] mergeIP(int [] arr, int start, int mid, int end){
        int [] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix [k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mix [k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
        return arr;
    }

    static int find(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int m = s +(e-s)/2;
        while (s <= e){
            if (arr[m]==target){
                return m;
            }
            if (arr[m+1]==target){
                return m+1;
            }
            if (arr[m-1]==target){
                return m-1;
            }
            if(arr[m+1]>target){
                e = m+1;
            }
            if (arr[m-1]>target){
                s = m-1;
            }
        }
        return -1;
    }
}
