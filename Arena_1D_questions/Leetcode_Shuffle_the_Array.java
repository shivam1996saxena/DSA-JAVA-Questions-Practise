package Arena_1D;

public class Leetcode_Shuffle_the_Array {
    public static void main(String[] args) {

    }
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            arr[x] = nums[i];
            x+=2;
        }
        for (int i = n; i < nums.length; i++) {
            arr[y] = nums[i];
            y += 2;
        }
        return arr;
    }
    // Implementation 2
    public int[] shuffle2(int[] nums, int n) {
        int [] arr = new int[2*n];
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            arr[x] = nums[i];
            arr[y] = nums[i+n];
            x+=2;
            y+=2;
        }
        return arr;
    }
}
