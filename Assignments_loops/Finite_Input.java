    package Assignments_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Finite_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        int a = sc.nextInt();
        while (a!=0){
            int b = sc.nextInt();
            input.add(b);
            if (b==0){
                break;
            }
        }
        int i = input.size()-1;
        System.out.print(a + " ");
        for (int j=0;j<=i;j++){
            System.out.print( input.get(j) + " ");
        }
    }
}
//    Problem Statement
//    Take input from standard input while you do not get 0 as an input.
//    Print all the inputs separated by space.
//    It is guaranteed that the number of integers are less than 100000.
//        Input
//        The input will contain a series of integers in one line each.
//        Input should be taken while you have not get a 0 as an input.
//
//        0 <= input <= 10
//        Output
//        Print the input integers seperated by space.
//        Example
//        Sample Input
//        6
//        5
//        5
//        0
//        Sample Output
//        6 5 5 0
//
//        Sample Input
//        9
//        3
//        5
//        7
//        6
//        9
//        8
//        3
//        2
//        7
//        7
//        3
//        5
//        0
//        Sample Output
//        9 3 5 7 6 9 8 3 2 7 7 3 5 0
