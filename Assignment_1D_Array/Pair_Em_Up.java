package Assignment_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_Em_Up {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0){
            int [] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int a = 0;
            int b = n-1;
            int answer = 0;
            for (int i = 0; i < n; i++)
            {
                int maxSum = 0;
                maxSum = maxSum + arr[a] + arr[b];
                a++;
                b--;
                if (maxSum>answer)
                {
                    answer = maxSum;
                }
            }
            System.out.print(answer);
        }
    }
}
//    Problem Statement
//    Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
//        Input
//        First line contains N.
//        Second line contains N space separated integers, denoting array.
//
//        Constraints:
//        1 <= N <= 100000
//        1 <= elements of the array <= 1000000000
//        Output
//        Print a single integer, minimum possible X.
//        Example
//        Sample Input
//        4
//        3 1 1 4
//
//        Sample Output
//        5
//
//        Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.