package Assignments_Sorting;

import java.util.*;

public class Removing_duplicates_from_lists {
    public static void main(String[] args) {
        String str = "aadddcccbbeexxxygghhzzp";
        removeDuplicate(str);
    }
    static void removeDuplicate(String str){
    ArrayList<Character> list = new ArrayList<>();
        char temp = '\u0000';
        for (int i = 0; i < str.length(); i++) {
            if (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                continue;
            }
            else {
                temp = str.charAt(i);
            }
            if (list.contains(temp)){
                continue;
            }
            else if (temp!='\u0000') {
                list.add(temp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size()-i;j++) {
                if (list.get(j)<list.get(j-1)){
                    char x = list.get(j);
                    list.remove(j);
                    list.add(j,list.get(j-1));
                    list.remove(j-1);
                    list.add(j-1,x);
                }
            }
        }
        System.out.println(list);
    }
}


//    Problem Statement
//    Given a string, convert it to a list containing all of its elements only once without any repetition,
//    even if there is repetition in the string.
//
//        hint - you might use sets for this.
//        Input
//        The input would be a string containing 5 characters. Each character can be any alpha numeric value.
//        Output
//        The output would be a sorted list with no repeating elements
//        Example
//        Sample input
//        abbbc
//
//        Sample output
//        ['a', 'b', 'c']
//
//        Explanation-
//        the string 'abbbc' contains elements 'a','b', and 'c' ,
//        therefore they are printed out in the list without any duplication.