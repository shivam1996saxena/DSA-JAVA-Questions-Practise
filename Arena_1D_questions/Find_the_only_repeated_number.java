package Arena_1D;

import java.util.Scanner;

public class Find_the_only_repeated_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
//    Problem Statement
//    An array of numbers is given. It has all unique elements except one. Find the only duplicate element in that array having all other unique elements.
//        Input
//        The first line contains an integer N, the number of elements in the array.
//        The second line contains N integers.
//
//        Constraints:
//        1 <= N <= 10^5
//        1 <= Elements of Array <= 10^5
//        Output
//        Print the single duplicate number in the array
//        Example
//        Input
//        6
//        1 2 3 4 4 5
//        Output
//        4
//        Explanation: 4 is repeated in this array
//
//        Input:
//        3
//        2 1 2
//        Output:
//        2