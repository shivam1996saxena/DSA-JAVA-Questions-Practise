package Arena_1D;
// https://leetcode.com/problems/matrix-diagonal-sum/
public class Leetcode_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int imp = mat.length/2;
        int i = 0;
        int e = mat.length-1;
        int sum = 0;
        for (int r = 0; r < mat.length; r++) {
            sum += mat[r][i]+ mat[r][e];
            i++;
            e--;
        }
        if (mat.length%2==0){
            return sum;
        }
        else {
            sum = sum - mat[imp][imp];
        }
        return sum;
    }
}
