package Assignment_1D_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int [] arr = {
                9,9,9,9,9,9,9,9,9,9
        };
        int k = 1;
        System.out.println((addToArrayForm(arr,k)));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> list = new ArrayList<>();
//        long number = 0;
//        for(int i = 0; i < num.length; i++) {
//            int j = 10;
//            if (i > 0) {
//                number = number * j + num[i];
//                j = j * 10;
//            } else {
//                number = num[i];
//            }
//        }
//        //12345
//        long finalNumber = number+k;
//        while (finalNumber != 0){
//            long t = (finalNumber%10);
//            list.add(0,(int)t);
//            finalNumber = finalNumber/10;
//        }
//        return list;
        int carry = 0;
        for (int i = num.length-1; i >= 0; i--) {
            int temp = k%10;
            if (num[i]+temp+carry>9){
                carry = (num[i]+temp)/10;
                num[i] = (num[i]+temp)%10;
                list.add(0,num[i]);
            }
            else {
                num[i] = num[i]+temp+carry;
                carry = 0;
                list.add(0,num[i]);
            }
            k = k/10;
        }
        if (carry>0){
            list.add(0,carry);
        }
        return list;
    }
}
