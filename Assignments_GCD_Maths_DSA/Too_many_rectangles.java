package Assignments_GCD_Maths_DSA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Too_many_rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = ((4 * n) + 1);
            int[] arr = new int[2*k];
            int ansX = 0;
            int ansY = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (i%2==0){
                    ansX ^= arr[i];
                }
                else ansY ^= arr[i];
            }
            System.out.println(ansX + " "+ ansY);
    }
}

//1 3 1 1 3 1 1 4 3 3
//    Problem Statement
//    Why Geometry?? ?
//
//        You are given 4*N+1 distinct points on the cartesian plane. Out of these points,
//        4*N points represent the end points of N rectangles (with axis parallel to co-ordinate axis),
//        while one point does not belong to any of the rectangles.
//        Report the co-ordinates of the point that does not belong to any of the N rectangles.

//        Input
//        The first line of the input contains an integer N.
//        The next 4*N+1 lines contain two integers X and Y, the co-ordinates of the given points.
//
//        Constraints
//        1 <= N <= 100000
//        0 <= X, Y <= 1000000
//        The given points always represent N rectangles and an extra point
//        Output
//        Output space separated X and Y co-ordinates of the extra point.
//        Example
//        Samle Input
//        1
//        1 3
//        1 1
//        3 1
//        1 4
//        3 3
//
//        Sample Output
//        1 4
//
//        Explanation: (1, 1), (1, 3), (3, 1), and (3, 3) represent the end of a rectangle,
//        while (1, 4) is the extra point.

//        int k = (4 * n) + 1;
//        int[] arr = new int[2*k];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if ((arr[i]^arr[j])==0){
//                    arr[i] = 0;
//                    arr[j] = 0;
//                }
//                else continue;
//            }
//        }
//        for (int e : arr){
//            if (e!=0) {
//                System.out.print(e + " ");
//            }
//        }
