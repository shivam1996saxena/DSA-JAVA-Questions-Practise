package Assignments_loops;

public class Rare_Numbers {
    public static void main(String[] args) {
        System.out.println(rare(2468,2));
    }
    static int rare(int N, int K){
//Enter your code here
        int counter = 0;
        int i = N;
        boolean Rare_number = false;
        while (i != 0)
        {
            i  =  i / 10;
            counter = counter + 1;
        }
        for (int j = counter; j>=1; j--)
        {
            int m = N % 10;
            N = N / 10;
            if (m%K==0)
            {
                Rare_number = true;
            }
            else {
                Rare_number = false;
                break;
            }
        }
        if (Rare_number){
            return(1);
        }
        else return(0);
    }
}
//    Problem Statement
//    A number s called rare if all of its digits are divisible by K. Given a number N your task is to check if the given number is rare or not.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Rare() that takes integer N and K as arguments.
//
//        Constraints:-
//        1 <= N <= 100000
//        1 <= K <= 9
//        Output
//        Return 1 if the given number is rare else return 0.
//        Example
//        Sample Input:-
//        2468 2
//
//        Sample Output:-
//        1
//
//        Sample Input:-
//        234 2
//
//        Sample Output:-
//        0