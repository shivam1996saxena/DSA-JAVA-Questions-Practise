package mock;

import java.util.Arrays;

public class Mock {
    public static void main(String[] args) {
//        Find first and last positions of an element in a sorted array
//[1,2,3,3,3,8]
//        x=3
//        2 and 4
//        x=2
        int [] arr = {1,2,3,0,0,0};
        int [] mr = {2,5,6};
        merge(arr, arr.length,mr,mr.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] mergeSorted = new int [m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        // to merge two arrays
        while (i < nums1.length && j < nums2.length){
            if (nums1[i]<nums2[j]){
                mergeSorted[k] = nums1[i];
                i++;
            }
            else {
                mergeSorted[k] = nums2[j];
                j++;
            }
            k++;
        }
        // to add the left incomplete array
        while (i < nums1.length){
            mergeSorted[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length){
            mergeSorted[k] = nums2[j];
            j++;
            k++;
        }
        System.out.print(Arrays.toString(mergeSorted));
    }
}
