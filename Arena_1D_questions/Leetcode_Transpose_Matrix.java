package Arena_1D;

import java.util.Arrays;

public class Leetcode_Transpose_Matrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
        };
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static int[][] transpose(int[][] matrix) {
        for (int r = 0; r < matrix.length-1; r++) {
            for (int c = r; c < matrix[r].length; c++) {
                if (c==r){
                    continue;
                }
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        return matrix;
    }
}
