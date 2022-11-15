package Assignment_1D_Array;

import java.util.Scanner;
//Question Commented Below
/*Boxes With Cubes
        Time Limit: 2 sec
        Memory Limit: 128000 kB
        Problem Statement
        We have A balls with the string S written on each of them and B balls with the string T written on each of them.
        Alice has two boxes. One contains A cubes with the string S written and other contains B cubes with the
         string T written.
        From these two boxes, Alice chooses one with the string U written on it and throws it away.
        Find the number of cubes in each of the box.

        Input
        The first line contains two strings S and T.
        The second line contains two integers A and B.
        The third line contains a single integer U.

        Constraints:
        S, T, and U are strings consisting of lowercase English letters.
        The lengths of S and T are each between 1 and 10 (inclusive).
        S!=T
        S=U or T=U.
        1≤A, B≤10
        A and B are integers.
        Output
        Find the number of cubes in each of the box.
        Example
        Sample Input 1:
        red blue
        3 4
        red
        Sample Output 1:
        2 4

        Explanation: Alice chose a cube with red written on it and threw it away.
        Now we have two cubes with the string S and four cubes with the string T.
        Sample Input 2:
        red blue
        5 5
        blue
        Sample Output 2:
        5 4
        Explanation: Alice chose a cube with blue written on it and threw it away.
        Now we have five cubes with the string S and four cubes with the string T.*/
public class Question_string_Boxes_with_cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.nextLine();
        if (u.equals(s)){
            a--;
        }
        else if(u.equals(t)){
            b--;
        }
        System.out.println(a + " " + b);
    }
}
