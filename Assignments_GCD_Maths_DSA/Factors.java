package Assignments_GCD_Maths_DSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
     factors(100);
    }
    static void factors(int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n / i == i){
                    System.out.print(i + " ");
                    continue;
                }
                System.out.print(i + " ");
                temp.add(n/i);
            }
        }
        for (int i = temp.size()-1; i >= 0; i--) {
            System.out.print(temp.get(i) + " ");
        }
    }
}
