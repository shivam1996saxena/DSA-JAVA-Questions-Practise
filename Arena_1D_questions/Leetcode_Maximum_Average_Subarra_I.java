package Arena_1D;

public class Leetcode_Maximum_Average_Subarra_I {
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double sum = 0;
        for (int i=0;i <= nums.length-k;i++){
            for(int j=i;j < i+k;j++){
                sum += nums[j];
            }
            if (max < sum/k){
                max = sum/k;
            }
            sum = 0;
        }
        return max;
    }
}
