package Assignments_loops;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public record Leetcode_Q1() {
    public static void main(String[] args) {
     int n = 234;
        System.out.println(ans(n));
    }
    static int ans(int n){
        int sum = 0;
        int product = 1;
        while (n/10 != n){
            int digit = n%10;
            n = n/10;
            sum += digit;
            product *= digit;
        }
        return (product-sum);
    }
}
