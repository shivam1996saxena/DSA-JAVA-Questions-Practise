package Arena_1D;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/
public class Leetcode_Plus_One {
    public static void main(String[] args) {
      int [] arr = {9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n-1;
        while (i >= 0) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
            i--;
            if (i < 0) {
                int[] arr = new int[n + 1];
                arr[0] = 1;
                for (int j = 1; j <= n; j++) {
                    arr[j] = digits[j - 1];
                }
                return arr;
            }
        }
        return new int[1];
    }
}
