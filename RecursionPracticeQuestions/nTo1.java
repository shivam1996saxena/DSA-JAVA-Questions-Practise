package RecursionPracticeQuestions;

public class nTo1 {
    public static void main(String[] args) {

    }
    // ques -> 6 : write a function to print numbers n to 1 using recursive approach
    static void printNumsDescendingOrder(int n){
        if (n==0){
            return;
        }
        System.out.print(n + " ");
        printNumsDescendingOrder(n-1);
    }
}
