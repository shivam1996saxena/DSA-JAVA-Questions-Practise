package RecursionPracticeQuestions;

public class SumUptoX {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }
    // ques 1 -> sum upto x
    static int sum(int n){
        if (n==1){
            return n;
        }
        return sum(n-1) + n;
    }
}
