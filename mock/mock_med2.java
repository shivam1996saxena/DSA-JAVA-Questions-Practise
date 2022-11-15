package mock;

import java.util.ArrayList;
import java.util.HashMap;

public class mock_med2 {
    public static void main(String[] args) {
        int [] arr = {8,3,21,19,61};
        System.out.println(kthLargest(arr,3));
    }
    static void characterFrequencyInString(String str){
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hash.containsKey(str.charAt(i))){
                hash.put(str.charAt(i),hash.get(str.charAt(i))+1);
            }
            else {
                hash.put(str.charAt(i),1);
            }
        }
        System.out.println(hash);
    }
    static int kthLargest (int [] arr, int k){
        int max = 0;
        int counter = 1;
        if (k > arr.length){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        while (counter != k){
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < max && temp < arr[i]){
                    temp = arr[i];
                }
            }
            max = temp;
            counter++;
        }
        return max;
    }
}
