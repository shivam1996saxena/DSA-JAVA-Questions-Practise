package Assignment_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

//Question Commented Below
/*
Array construction
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two arrays - value and frequency both containing N elements.
There is also a third array C which is currently empty.
Then you perform N insertion operation in the array. For ith operation you insert value[i]
to the end of the array frequency[i] number of times.
Finally you have to tell the kth smallest element in the array C.

Input
First line of input contains N.
Second line contains N integers denoting array - value
Third line contains N integers denoting array - frequency
Fourth line contains single integer K.

Constraints
1 <= N, value[i], frequency[i] <= 100000
1 <= k <= frequency[1] + frequency[2] +frequency[3] +........ + frequency[N]
Output
Output a single integer which is the kth smallest element of the array C.
Example
Sample input 1
5
1 2 3 4 5
1 1 1 2 2
3
Sample output 1
3
Explanation 1:
Array C constructed is 1 2 3 4 4 5 5
Third smallest element is 3

Sample input 2
3
2 1 3
3 3 2
2
sample output 2
1

Explanation 2:
Array C constructed is 2 2 2 1 1 1 3 3
Second smallest element is 1
*/
public class Question_Array_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] value = new int[size];
        int [] frequency = new int[size];
        int totalElements = 0;
        for (int i = 0; i < size; i++) {
            value [i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            frequency [i] = sc.nextInt();
            totalElements += frequency [i];
        }
        int k = sc.nextInt();
        int [] constructedArray = new int[totalElements];
        int index = constructedArray.length-1;
        for (int i = size-1; i >= 0; i--) {
            int val = value[i];
            int freq = frequency[i];
            while (freq != 0){
                constructedArray[index] = val;
                freq--;
                index--;
            }
        }
        Arrays.sort(constructedArray);
        System.out.println(constructedArray[k-1]);
    }
}
