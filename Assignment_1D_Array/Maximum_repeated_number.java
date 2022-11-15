package Assignment_1D_Array;

public class Maximum_repeated_number {
    public static void main(String[] args) {
     int [] arr = {3,2,2,1,2,4,2,4,5};
        System.out.println(maxRepeated(arr));
    }
    static int maxRepeated(int[] arr){
        int count = 0;
        int maxRepeat = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    temp++;
                }
            }
            if (temp+1>count){
                count = temp+1;
                maxRepeat = arr[i];
            }
        }
        return maxRepeat;
    }
}
