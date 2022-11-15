package Assignments_Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Removing_Duplicates_from_lists_sol2 {
    public static void main(String[] args) {
        String str = "abbbc";
        System.out.println(Removing_duplicates(str));
    }
    static List<String> Removing_duplicates(String str){
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        List<String> list  = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains("'" + arr[i] + "'")){
                continue;
            }
            else {
                list.add("'" + arr[i] + "'");
            }
        }
        return list;
    }
}
