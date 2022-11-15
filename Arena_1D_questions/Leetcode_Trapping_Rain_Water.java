package Arena_1D;

public class Leetcode_Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int i = 0;
        int totalWater = 0;
        int water = 0;
        int j = i + 1;
        while (i < height.length - 1) {
            if (height[j] >= height[i]) {
                i = j;
                j = i+1;
                totalWater += water;
                water = 0;
            }
            else {
                water += height[i] - height[j];
                j++;
            }
            if (j == height.length) {
                i++;
                j = i+1;
                water = 0;
            }
        }
        return totalWater;
    }
}
