package RecursionPracticeQuestions;

public class Print_Digits_of_a_number_in_reverse_order {
    public static void main(String[] args) {
        System.out.println(revOfDigits(12345));
    }
    //ques 3 -> given a number print all its digits in reverse order
    static void printDigitsRev(int n){
        if (n/10==0){
            System.out.print(n%10);
            return;
        }
        System.out.print(n%10);
        System.out.println();
        n = n / 10;
        printDigitsRev(n);
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
