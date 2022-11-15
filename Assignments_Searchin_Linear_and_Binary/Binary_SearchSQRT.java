package Assignments_Searchin_Linear_and_Binary;
public class Binary_SearchSQRT {
    public static void main(String[] args) {
    int n = 40;
        System.out.println(sqrt(3,10));
    }
    static double sqrt(int n,int p){
        int start = 0;
        int end = n;
        double ans = 0.0;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid*mid == n){
                return mid;
            }
            if (mid*mid<n){
                start = mid+1;
                ans = mid;
            }
            else end = mid-1;
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (ans*ans <=n) {
                if (ans * ans < n) {
                    ans += incr;
                }
            }
            ans -= incr;
            incr = incr/10;
        }
        return ans;
    }
}
