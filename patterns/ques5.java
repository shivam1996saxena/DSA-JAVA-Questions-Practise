package patterns;
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 2*n; i++) {
            int c = i > n ? 2*n-i : i;
            for (int j = 1; j <= c; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
