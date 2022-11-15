package RecursionPracticeQuestions;

public class Palindrome {
    public static void main(String[] args) {
    }
    static boolean isPalindrome(int n){
        if (n == revOfDigits(n)){
            return true;
        }
        return false;
    }
    static int revOfDigits(int n) {
        int digit = (int) (Math.log10(n) + 1);
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return (int) (rem*Math.pow(10,digit-1) + helper(n/10,digit-1));
    }
}
