package Arena_1D;
 
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Arena_1D_Count_Duplicates {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = c.nextInt();
        }
        // input of array
        Arrays.sort(arr);// sorted array
        System.out.println();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else hash.put(arr[i], 1);
        }
        for (int e : hash.keySet()) {
            int count = hash.get(e);
            if (count > 1) {
                System.out.println(e + " " + count);
            }
        }
    }
}
