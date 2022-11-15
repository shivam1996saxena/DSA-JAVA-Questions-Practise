package Assignment_1D_Array;

import java.util.HashMap;
import java.util.Scanner;

//Question Commented Below
/*
Array Indexing
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Find the number of indexes i (1 <= i <= N) such that the sum of the
elements to its right is atmost equal to the sum of elements to its left.
Input
The first line of input contains N, the size of the array.
The second line of input contains N space seperated integers Ai.

Constraints:
1 <= N <= 105
-109 <= Ai <= 109
Output
Print the number of indexes i (1 <= i <= N) such that the sum of the elements to its right is atmost equal to the sum of elements to its left.
Example
Sample Input:
5
3 -2 4 -1 4
Sample Output:
2
*/
public class Question_Array_Indexing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array [i] = sc.nextInt();
        }
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sum += array[i];
            map.put(array[i],sum);
        }
        int totalSum = sum;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < size; i++) {
            int temp = Math.abs((map.get(array[i])-array[i])-Math.abs(totalSum- map.get(array[i])));
            if(temp<minDiff){
                minDiff = temp;
                ans = i;
            }
        }
        System.out.println(minDiff);
        System.out.println(ans);
    }
}
