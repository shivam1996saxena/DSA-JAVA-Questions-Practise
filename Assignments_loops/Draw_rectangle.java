package Assignments_loops;

import java.util.Scanner;

//Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
//Sample Input:-
//        3 3
//
//        Sample Output:-
//        ***
//        * *
//        ***
public class Draw_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=1; i <= n;i++){
            for (int j = 1; j <= m;j++){
                if ((i==1)||(j==1)||(i==n)||(j==m))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
