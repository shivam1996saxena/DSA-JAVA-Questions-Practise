package Arena_1D;

import java.util.Scanner;

//Question Commented Below
/*
Building Energy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N buildings numbered from 1 to N in a straight line, the ith building having height hi. You start from a building 1 and move towards building N. If the height of the next building is greater than current, you expend twice the difference in heights of buildings energy units. If the height of the next building is lesser than current, you expend the difference in heights of buildings energy units.
Find the total amount of energy you would have to expend up untill you reach building N.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= hi <= 109
Output
Print the total amount of energy you would have to expend uptill you reach building N.
Example
Sample Input:
5
3 5 2 1 7

Sample Output:
20
 */
public class Building_Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int energy = 0;
        for (int i = 0; i < size; i++) {
            if (i < array.length-1 && array[i] < array[i+1]){
                energy += 2 * Math.abs(array[i+1]-array[i]);
            }
            else if(i < array.length-1 && array[i] > array[i+1]) {
                energy += Math.abs(array[i+1]-array[i]);
            }
        }
        System.out.println(energy);
    }
}
