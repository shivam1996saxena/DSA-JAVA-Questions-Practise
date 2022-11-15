package Assignment_1D_Array;

public class Kth_smallest_element {
    public static void main(String[] args) {
        int [] arr = {7,10,4,3,20,15};
        System.out.println(KthSmallest(arr,3));
    }
    static int KthSmallest(int [] arr,int k) {
        int min = Integer.MAX_VALUE;
        int counter = 1;
        if (k > arr.length) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        while (counter != k) {
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > min && temp > arr[i]) {
                    temp = arr[i];
                }
            }
            min = temp;
            counter++;
        }
        return min;
    }
}
