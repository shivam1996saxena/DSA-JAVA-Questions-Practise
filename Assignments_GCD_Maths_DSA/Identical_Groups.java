package Assignments_GCD_Maths_DSA;

import java.util.Scanner;

public class Identical_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        if (x>y){
            for (int i = y; i > 0; i--) {
                if (x % i ==0&&y % i ==0){
                    count = i;
                    System.out.println(count);
                    return;
                }
            }
        }
           else if(x<y) {
            for (int i = x; i > 0; i--) {
                if (x % i == 0 && y % i == 0) {
                    count = i;
                    System.out.println(count);
                    return;
                }
            }
        }
        System.out.println(1);
    }
}
