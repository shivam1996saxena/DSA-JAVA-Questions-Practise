package Arena_1D;
//https://leetcode.com/problems/number-of-good-pairs/
public class Leetcode_Number_of_Good_Pairs {
    public static void main(String[] args) {

    }
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
