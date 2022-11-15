package Assignments_Searchin_Linear_and_Binary;

public class Sqrt_via_search {
    public static void main(String[] args) {
     //   System.out.println(square_root(2147395599));
        System.out.println(16%4);
    }
    static int square_root(int n){
        int start = 1;
        int end = n;
        int ans = 0;
        while (start<=end){
            int m = start + (end-start)/2;

            if (m==n/m){
                return m;
            }
            if (m>n/m){
                end = m - 1;
            }
            else if (m<n/m){
                start = m + 1;
                ans = m;
            }
        }
        return ans;
    }
}
