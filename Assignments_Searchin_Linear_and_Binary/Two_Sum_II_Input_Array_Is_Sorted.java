package Assignments_Searchin_Linear_and_Binary;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
    int [] arr = {5,7,25,75};
        System.out.println(Arrays.toString(twoSum(arr, 82)));
    }
    public static int[] twoSum1(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                   if (numbers[i]+numbers[j]==target){
                       return new int[]{i+1,j+1};
                   }
                }
            }
            return new int[]{-1, -1};
    }
    public static int[] twoSum(int[] numbers, int target) {
        //2 3 4
        int start = 0;
        int end = numbers.length-1;
        while (start <= end){
            int check = numbers[start]+numbers[end];
            if (check==target){
                return new int[] {start+1,end+1};
            }
            if (check>target){
                end--;
            }
            if (check<target){
                start++;
            }
        }
        return new int[] {-1,-1};
    }
}
