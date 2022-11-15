package Bitwise_Operator_Formulas_and_Questions;

public class Find_ith_bit_of_a_number {
    public static void main(String[] args) {
        System.out.println(findBit(0,1));
    }
    public static int findBit(int n,int i){
        return (1<<i-1)&n;
    }
}
