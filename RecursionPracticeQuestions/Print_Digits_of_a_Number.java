package RecursionPracticeQuestions;

public class Print_Digits_of_a_Number {
    public static void main(String[] args) {
       printDigits(12345);
    }
    //ques 2 -> given a number print all its digits
    static void printDigits(int n) {
        if (n/10==0){
            System.out.print(n%10);
            System.out.println();
            return;
        }
        printDigits(n/10);
        System.out.print(n%10);
        System.out.println();

    }
}
