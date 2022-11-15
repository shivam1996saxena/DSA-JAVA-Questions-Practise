package Arena_1D;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class Leecode_Flipping_an_Image {
    public static void main(String[] args) {
    int [][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
    };
        System.out.println(arr.length);
        System.out.println((Arrays.deepToString(flipAndInvertImage2(arr))));
    }
//    public static int[][] flipAndInvertImage(int[][] image) {
//        for (int row = 0; row < image.length; row++) {
//            int s = 0;
//            int e = image[row].length - 1;
//            while (s <= e) {
//                int temp = image[row][s];
//                image[row][s] = image[row][e];
//                image[row][e] = temp;
//                s++;
//                e--;
//            }
//            int i = 0;
//            while (i < image[row].length){
//                if (image[row][i]==1){
//                    image[row][i]-=1;
//                }
//                else {
//                    image[row][i] +=1;
//                }
//                i++;
//            }
//        }
//        return image;
//    }
public static int[][] flipAndInvertImage2(int[][] image) {
    int n = image.length;
    int arr[][] = new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=n-1; j>=0; j--){
            if(image[i][j] == 0){
                arr[i][n-j-1] = 1;
            }
            else{
                arr[i][n-j-1] = 0;
            }
        }
    }
    return arr;
    }
}
