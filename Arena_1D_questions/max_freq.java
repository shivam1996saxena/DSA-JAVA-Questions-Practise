package Arena_1D;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class max_freq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Pair pair = maxFrequency(arr);
        System.out.println("The Element " + pair.x + " is Max Frequency Element with Frequency " + pair.y);
    }
    static Pair maxfreq (int [] arr){
        Arrays.sort(arr);
        int ans = 0;
        int maxF = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                count++;
                if (count > maxF){
                    maxF = count;
                    ans = arr[i];
                }
            }
           else {
               count = 1;
            }
        }
        Pair pair = new Pair(ans,maxF);
        return pair;
    }
    static Pair maxFrequency (int [] arr){
        HashMap <Integer,Integer> hash = new HashMap<>();
        int ans = 0;
        int freq = 0;
        // 5 5 5 5 4 8 8 8
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else hash.put(arr[i],1);
        }
        for (int i : arr){
            int count = hash.get(i);
            if (count>freq){
                freq = hash.get(i);
                ans = i;
            }
        }
        Pair pair = new Pair(ans,freq);
        return pair;
    }
}
class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}