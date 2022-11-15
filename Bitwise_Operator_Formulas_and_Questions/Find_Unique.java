package Bitwise_Operator_Formulas_and_Questions;

public class Find_Unique {
    public static void main(String[] args) {
        int [] ar = {1,1,2,2,4,4,5,5,3};
        System.out.println(unique(ar));
    }
    public static int unique(int[] arr){
        int u = 0;
        for (int e : arr){
            u ^= e;
        }
        return u;
    }
}
