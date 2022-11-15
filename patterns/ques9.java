package patterns;
//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *
import java.util.Scanner;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 2*i; j > 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
