package Assignments_Searchin_Linear_and_Binary;

import java.util.Arrays;

public class First_and_Last_Index_of_repeatedElement {
    public static void main(String[] args) {
        int [] arr =  {1,2,3,3,3,3,3,4,5};
        System.out.println(Arrays.toString(search(arr,3,0,0)));
    }
    static int [] search(int[] arr,int target,int firstIndex,int lastIndex){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int m = s + (e-s)/2;
            if (arr[m] == target){
                firstIndex = m;
                e = m-1;
            }
            if (arr[m] < target){
                s = m + 1;
            }
            if (arr[m] > target) {
                e = m - 1;
            }
        }
        int s1 = 0;
        int e1 = arr.length-1;
        while (s1 <= e1){
            int m = s1 + (e1-s1)/2;
            if (arr[m] == target){
                lastIndex = m;
                s1 = m + 1;
            }
            if (arr[m] < target){
                e1 = m + 1;
            }
            if (arr[m] > target) {
                e1 = m - 1;
            }
        }
        return new int[] {firstIndex,lastIndex};
    }
}
