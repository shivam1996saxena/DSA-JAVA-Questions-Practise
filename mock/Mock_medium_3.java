package mock;

public class Mock_medium_3 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(isSumK(arr,3));
    }
    static int difference (int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return max-min;
    }
    static boolean isSumEqualsToK (int [] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j]  == k){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSumK(int [] arr, int k){
        int i = 0;
        int j = i+1;
        while (i != arr.length-1){
            if (arr [i] + arr[j] == k){
                return true;
            }
            else{
                j++;
            }
            if (j == arr.length-1){
                i++;
                j = i+1;
            }
        }
        return false;
    }
}
