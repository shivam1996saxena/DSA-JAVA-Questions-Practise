package Bitwise_Operator_Formulas_and_Questions;

public class No_of_Digits_in_any_Base {
    public static void main(String[] args) {
        System.out.println(countDigits(4,2));
    }
    public static int countDigits(int n,int base){
        return (int)(Math.log(n)/Math.log(base)+1);
    }

}
