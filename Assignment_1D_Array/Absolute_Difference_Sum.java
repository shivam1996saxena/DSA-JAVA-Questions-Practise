package Assignment_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

/*Problem Statement
        Given an array A of size N. Value of an element Ai is defined as the sum of absolute difference of all elements
        of the array with Ai.
        More formally, the value of an element at index i is sum of |Ai - Aj| over all j (1 <= j <= N).
        Find the maximum such value over all i (1 <= i <= N) in the array.

        Note: Given array is 1-based index
        Input
        First line of the input contains a single integer N.
        The second line of the input contains N space seperated integers.

        Constraints:
        1 <= N <= 105
        1 <= Ai <= 109
        Output
        Print the maximum such value over all i (1 <= i <= N) in the array.
        Example
        Sample Input:
        6
        1 1 5 5 8 9

        Sample Output:
        25

        Explaination:
        For, i = 6,
        |A1 - A6| = 8
        |A2 - A6| = 8
        |A3 - A6| = 4
        |A4 - A6| = 4
        |A5 - A6| = 1
        Value = 8 + 8 + 4 + 4 + 1 = 25
        All other i, give values less than 25.*/
public class Absolute_Difference_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int i = 0;
        int j = size-1;
        while (i < j){
            sum += (Math.abs(arr[j]-arr[i]));
            i++;
        }
        System.out.println(sum);
    }
}
