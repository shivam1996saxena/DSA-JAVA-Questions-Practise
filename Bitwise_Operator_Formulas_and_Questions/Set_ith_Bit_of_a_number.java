package Bitwise_Operator_Formulas_and_Questions;
// set bit basically means that if i-th bit is 0 make it 1 if its 1 let it be 1.
// reset bit basically means that if i-th bit is 0 let it be 0 it if its 1 make it 0.
public class Set_ith_Bit_of_a_number {
    public static void main(String[] args) {
        System.out.println(setBit(0,1));
    }
    public static int setBit(int n,int i){
        return (1<<i-1)|n;
    }
}
