package Assignment_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int k = sc.nextInt();
//        int [] arr = enterArray(size);
//        System.out.println(Arrays.toString(subArrayWithSumK(arr,k)));
        int size = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 1;
        int sum = arr[i]+arr[j];
        int [] ans = {-1,-1};
        while (i <= j && j < arr.length){
            if (sum < k){
                j++;
                sum += arr[j];
            }
            else if (sum == k){
                ans [0] = i+1;
                ans [1] = j+1;
                break;
            }
            else if (sum > k){
                while (sum > k){
                    sum = sum - arr[i];
                    i++;
                }
            }
        }
        System.out.print(ans[0] + " " + ans[1]);
    }
    static int [] enterArray (int size){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int [] subArrayWithSumK(int []    arr, int k){
        int i = 0;
        int j = 1;
        int sum = arr[i];
        int [] ans = {-1,-1};
        while (j < arr.length){
            sum += arr[j];
            if (sum < k){
                j++;
            }
            else if (sum == k){
                ans [0] = i+1;
                ans [1] = j+1;
                return ans;
            }
            else if (sum > k){
                while (sum > k){
                    sum = sum - arr[i];
                    i++;
                }
            }
        }
        return ans;
    }
}
