package Arena_1D;

import java.util.Scanner;

//Question Commented Below
/*
Best Score
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array (Arr) of N integers. You have to select a subsequence from this array such that its score is best possible.
Score of a sequence is equal to 0 if the sum of the elements of the sequence is divisible by 10
otherwise the score is the sum of the elements of the sequence.
For example: the score of sequence 11, 2, 2, 1 is 16, and the score of sequence 1, 9 is 0.
You have to print the maximum possible score.
Input
The first line of input contains N.
The second line of input contains N space-separated integers representing the array (Arr).

Constraints :
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print the maximum possible score.
Example
Sample Input 1
3
5 10 15
Sample output 1
25
Explanation: we select 10, 15 as our sequence.

Sample Input 2
2
10 20
Sample output 2
0
Explanation: we have to select an empty sequence.
*/
public class Best_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int i = 0, j = arr.length-1;
        if (sum % 10 == 0){
            while (sum % 10 == 0 && i <= j){
                int temp = Math.min(arr[i],arr[j]);
                if (temp == arr[i]){
                    i++;
                }
                else{
                    j--;
                }
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
