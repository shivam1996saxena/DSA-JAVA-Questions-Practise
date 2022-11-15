package Assignments_GCD_Maths_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Weird_chapo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

    }
}
//    Problem Statement
//    Rick wants to give Morty a chapo (a super awesome treat :P).
//
//        The only condition for Morty to get a chapo is that he should be able to reach Rick's place.
//        Both Rick and Morty live on the number line at integer points A and B respectively.
//        There are N types of moves M1, M2,. , MN.
//        Morty can only take steps of size Mi (1 <= i <= N) in either of the two directions
//        on the number line (any number of times), while Rick prefers to stay at his place.
//        Please let Morty know if he can ever reach Rick's place and get a chapo.

//        Input
//        The first line of the input contains three integers N, A, and B denoting the total number of step sizes, the position of Rick, and the position of Morty.
//        The next line contains N integers Mi denoting the various step sizes that Morty can take.
//
//        Constraints
//        1 <= N <= 200000
//        1 <= Mi <= 109
//        -109 <= A, B <= 109
//        Output
//        Output Yes if Morty can reach Rick's place, else output No
//        Example
//        Sample Input
//        3 19 2
//        3 5 4
//        Sample Output
//        Yes
//
//        Explanation: Morty lives at position 2, while Rick lives at position 19. Morty can take the following path to reach Rick's place (there are several other ways as well):
//        Move M2 = 5 to the right.
//        Move M1 = 4 to the right.
//        Move M1 = 4 to the right.
//        Move M1 = 4 to the right.
//
//        Sample Input 2
//        4 10 15
//        10 20 30 40
//        Sample Output 2
//        No