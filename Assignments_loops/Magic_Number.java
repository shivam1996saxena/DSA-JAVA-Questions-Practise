package Assignments_loops;

public class Magic_Number {
    public static void main(String[] args) {
        System.out.println(magicNumber(100));
    }
    static int magicNumber(int N){
        int i = N;
        int ans1 = -1;
        while (i > 0) {
            int n = i;
            boolean magicno1 = false;
            boolean magicno2 = false;
            while (n>0) {
                int m = n % 10;
                int k = n / 10;
                n = k;
                if (m == 9) {
                    magicno1 = true;
                } else if (m == 7) {
                    magicno2 = true;
                }
            }
            if (magicno1 && magicno2) {
                ans1 = i;
                break;
            }
            i++;
        }
        int j = N;
        int ans2 = -1;
        while (j > 0) {
            int n = j;
            boolean magicno1 = false;
            boolean magicno2 = false;
            while (n>0) {
                int m = n % 10;
                int k = n / 10;
                n = k;
                if (m == 9) {
                    magicno1 = true;
                } else if (m == 7) {
                    magicno2 = true;
                }
            }
            if (magicno1 && magicno2) {
                ans2 = j;
                break;
            }
            j--;
        }
        if (ans1==-1){
            return ans2;
        }
        if (ans2==-1){
            return ans1;
        }
        if (ans1-N<N-ans2){
            return ans1;

        } else {

            return ans2;
        }
    }
}
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        A magic number is a natural number that contains both the digits 7 and 9 in it.
//        For eg:- 79, 879, 53729 etc.
//        Given a number N, your task is to find the closest Magic number from the given number N.
//
//        Note:- If more than one answer exists return the minimum one
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input.
//        You just have to complete the function MagicNumber() that takes integer N as argument.
//
//        Constraints:-
//        1 <= N <= 100000
//        Output
//        Return a magic number closest to the given number N.
//        Example
//        Sample Input:-
//        8
//        Sample Output:-
//        79
//
//        Sample Input:-
//        900
//        Sample Output:-
//        897
