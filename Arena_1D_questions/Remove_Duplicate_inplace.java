package Arena_1D;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//Question Commented Below
/*
Remove Duplicates Inplace
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sorted array, remove the duplicates in place such that each element appears at most twice and returns the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.
Input
First-line will contain a single integer N denoting array length
Second-line will contain the elements of the array

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^5
Output
Print the length of the final array
Example
Sample Input:
4
1 1 1 2

Sample Output:
3

Explanation:-
A is now [1,1,2].

Sample Inpiut:
3
1 2 3

Sample Output:
3

 */
public class Remove_Duplicate_inplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (hash.containsKey(array[i])) {
                if (hash.containsKey(array[i]) && hash.get(array[i]) < 2) {
                    hash.put(array[i], hash.get(array[i]) + 1);
                }
                if (hash.containsKey(array[i]) && hash.get(array[i]) > 2) {
                    hash.put(array[i], hash.get(array[i]));
                }
            }
            else hash.put(array[i], 1);
        }
        int length = 0;
        Set<Integer> set = hash.keySet();
        for (Integer a : set){
            length += hash.get(a);
        }
        System.out.println(length);
    }
}
