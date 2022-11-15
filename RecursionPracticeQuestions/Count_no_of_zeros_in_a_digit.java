package RecursionPracticeQuestions;

public class Count_no_of_zeros_in_a_digit {
    public static void main(String[] args) {
        System.out.println(countZeros(1010100010,0));
    }
    static int countZeros(int n, int count){
        if (n % 10 == 0){
            count++;
        }
        if (n % 10 == n){
           return count;
        }
        return countZeros(n/10,count);
    }
}
