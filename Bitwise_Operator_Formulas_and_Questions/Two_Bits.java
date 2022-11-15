package Bitwise_Operator_Formulas_and_Questions;

import java.util.Scanner;

public class Two_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        if (x < 3){
            System.out.print(Math.abs(x-3));
        }
        else
        {
            long count = 0;
            long temp = x;
            while (temp > 0) {
                count += temp & 1;
                temp >>= 1;
            }
            if  (count==2){
                System.out.print(0);
            }
            if  (count==1){
                System.out.print(Math.abs(x-(x+1)));
            }
            else {
                long tempo = x-1;
                int c = 0;
                while (c != 2){
                    c = 0;
                    long t = tempo;
                    while (t > 0) {
                        c += t & 1;
                        t >>= 1;
                    }
                    tempo--;
                }
                System.out.print(Math.abs(x-tempo));
            }
        }
    }
}
