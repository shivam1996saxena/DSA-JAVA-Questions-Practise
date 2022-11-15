package Two_pointers;

public class Max_subarray_sum_size_K {
    public static void main(String[] args) {
        int [] arr = {-1,5,2,-3};
        System.out.println(maxSumOfSubArraySize(arr,2));
    }
    static int maxSumOfSubArraySize(int [] arr, int k){
        // -1 5 2 -3   // k = 2
        int i = 0;
        int sum = 0;
        int temp = 0;
        int j = i;
        while (i < arr.length-k){
            temp += arr[j];
            if (j == i+k){
                i++;
                j = i;
                temp = 0;
            }
            else {
                j++;
            }
            if (sum < temp){
                sum = temp;
            }
        }
        return sum;
    }
}
