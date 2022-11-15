package Arena_1D;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Leetcode_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int i = 0;
        int ans = 0;
        while (i < nums.length){
            int counter = 1;
            int n = nums[i];
            while (n % 10 != n){
                counter++;
                n = n / 10;
            }
            if (counter%2==0){
               ans++;
            }
            i++;
        }
        return ans;
    }
}
