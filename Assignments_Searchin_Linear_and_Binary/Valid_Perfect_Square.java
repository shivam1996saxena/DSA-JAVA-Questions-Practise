package Assignments_Searchin_Linear_and_Binary;
//https://leetcode.com/problems/valid-perfect-square/
public class Valid_Perfect_Square {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        // s = start / e = end / m = medium
            long s = 1;
            long e = num/2;
            while (s <= e){
                long m = s + (e-s)/2;
                if (m*m==num){
                    return true;
                }
                if (m*m>num){
                    e = m-1;
                }
                else s = m+1;
            }
            return false;
    }
}
