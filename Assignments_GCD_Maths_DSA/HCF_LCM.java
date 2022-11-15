package Assignments_GCD_Maths_DSA;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(8,64));
        System.out.println(lcm(8,64));
    }
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm (int a, int b){
        return a * b / gcd(a , b);
    }
}
