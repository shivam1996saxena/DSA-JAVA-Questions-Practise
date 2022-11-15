package Assignments_loops;

class Pattern_2 {
    public static void main(String[] args) {
    pattern(6);
    }
    static void pattern(int N){
//Enter your code here
        int m;
        m = N-2;
        System.out.println("*");
        for (int i = 1;i <= m;i++){
            System.out.print("*");
            for (int j = 0; j <= (i-1);j++){
                System.out.print("^");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int k = 1;k <= (N+1);k++){
            System.out.print("*");
        }
    }
}
//    Problem Statement
//    Given an integer N, you have to print the given below pattern for N >= 3.
//
//        Pattern for N = 4:-
//        *
//        *^*
//        *^^*
//        *****
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as argument.
//
//        Constraints:-
//        1 <= N <= 100
//        Output
//        Print the given pattern for size N.
//        Example
//        Sample input:-
//        3
//
//        Sample Output:-
//        *
//        *^*
//        ****
//
//        Sample Input:-
//        6
//
//        Sample Output:-
//        *
//        *^*
//        *^^*
//        *^^^*
//        *^^^^*
//        ******
