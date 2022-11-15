package Bitwise_Operator_Formulas_and_Questions;

public class RightMost_setBit {
    public static void main(String[] args) {
        System.out.println(rightMostSetBit(3));
    }
    public static int rightMostSetBit(int n){
        return n&(-n);
    }
}
