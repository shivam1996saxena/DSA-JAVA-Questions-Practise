package RecursionPracticeQuestions;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sum(1216));
    }
    static int sum(int n){
        if (n/10==0){
            return n%10;
        }
      return sum(n/10)+n%10;
    }
}
//Problem Statement
// You have given an Integer N
// You have to write a recursive function to add all the digits of N and return a sum.