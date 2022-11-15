package patterns;
//            *
//           * *
//          *   *
//         *     *
//        *********
import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+2; j++) {
                if (j==0||j==i+1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
