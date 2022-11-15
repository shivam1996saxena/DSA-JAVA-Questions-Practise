package Assignments_loops;

class Print_digits{
    public static void main(String[] args) {
      printDigits(12345);
    }
    static void printDigits(int N){
        int m;
        int rev = 0;
        while (N!=0) {
            int p = N % 10;
            rev = (rev * 10) + p;
            N = N / 10;
        }
        while (rev!=0){
            m = rev % 10;
            rev = rev /10;
            switch (m){
                case 1 :
                    System.out.print("one ");
                    break;
                case 2 :
                    System.out.print("two ");
                    break;
                case 3 :
                    System.out.print("three ");
                    break;
                case 4 :
                    System.out.print("four ");
                    break;
                case 5 :
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9 :
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("zero ");
                    break;
            }
        }
    }
}
//   Problem Statement
//   Given a natural number N, your task is to print all the digits of the number in words.
//   The words have to separated by space and in lowercase english letters.
//
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input.
//        You just have to complete the function Print_Digit() that takes integer N as a parameter.
//      Output
//        Print the digits of the number as shown in the example.
//        Note:- Print all digits in lowercase English letters
//      Example
//        Sample Input:-
//        1024
//        Sample Output:-
//        one zero two four