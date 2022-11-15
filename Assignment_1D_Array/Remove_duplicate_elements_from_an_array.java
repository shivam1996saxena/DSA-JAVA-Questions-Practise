package Assignment_1D_Array;

import java.util.Arrays;

public class Remove_duplicate_elements_from_an_array {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,5,8,8,9,9,3,4,4,6};
        Arrays.sort(arr);
        removeRepeated(arr);
    }
    static void removeRepeated(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > i; j--) {
                if (arr[j]!=arr[j-1]){
                    System.out.print(arr[j] + " ");
                }
                else continue;
            }
        }
    }
}
