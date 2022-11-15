package Bitwise_Operator_Formulas_and_Questions;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (even(n)){
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
    public static boolean even(int n){
        if ((n&1)==0){
            return true;
        }
        return false;
    }
}
