package patterns;

import java.util.Scanner;
//        *****
//         ****
//          ***
//           **
//            *
public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
