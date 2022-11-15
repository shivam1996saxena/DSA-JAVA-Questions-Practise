package RecursionPracticeQuestions;
//steps are if a number is even divide it by 2 else subtract one from number
// calculate the number of steps
public class Steps_to_reduce_a_number {
    public static void main(String[] args) {
        System.out.println(Steps(20));
    }
    public static int Steps(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int steps){
        if (n == 0){
            return steps;
        }
        if (n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
