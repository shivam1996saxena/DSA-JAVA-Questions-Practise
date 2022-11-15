package mock;

public class Mock_Challenge_1 {
    public static void main(String[] args) {
        int [] arr = {2,8,5,4};
        System.out.println(minimumSwap(arr));
    }
    static int maximumXOR(int [] arr){
        int ans = 0;
        int tempXOR = 0;
        int totalXOR = 0;
        for (int i = 0; i < arr.length; i++) {
            tempXOR ^= arr[i];
        }
        totalXOR = tempXOR;
        if (ans<tempXOR){
            ans = tempXOR;
        }
        int i = 0;
        int j = 0;
        while (i < arr.length-1) {
            for (int k = i; k <= j; k++) {
               tempXOR = totalXOR ^ arr[k];
            }
            if (ans<tempXOR){
                ans = tempXOR;
            }
            j++;
            if (j == arr.length-1){
                i++;
                j = 0;
            }
        }
        return ans;
    }
    static int minimumSwap(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = i;
        int counter = 0;
        while (j < arr.length-1){
            if (arr[j] < arr[j+1]){
                j++;
            }
            else {
                int min = Integer.MAX_VALUE;
                    for (int k = j; k < arr.length; k++) {
                        if (arr[k] < min) {
                            min = arr[k];
                        }
                    }
                    int temp = arr[j];
                    arr[j] = min;
                    min = temp;
                    counter++;
            }
        }
        return counter;
    }
}
//    Given an array arr[] of N positive integers. Find an integer denoting the maximum XOR subset value in the given array arr[].
//        Input :
//        N = 3
//        arr[] = {2, 4, 5}
//        Output : 7
//
//        Explanation :
//        The subset {2, 5} has maximum
//        subset XOR value.
//        Input :
//        N= 3
//        arr[] = {9, 8, 5}
//        Output : 13
//        Explanation :
//        The subset {8, 5} has maximum
//        subset XOR value.
//Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing
// order.
//
//        Input:
//        nums = {2, 8, 5, 4}
// 8 5 4 2 //2 5 4 8// 2 4 5 8
// 5 4 8 2//2 4 8 5//2 4 5 8
// 2 5 4 8
// 4 8 5 2
//        Output:
//        1
//        Explaination:
//        swap 8 with 4.