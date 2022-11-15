package Assignments_loops;

public class Triangle {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
//Enter your code here
        for (int i = n;i >= 1;i--){
            for (int j = i; j >= 1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    Problem Statement
//    Sara loves pattern, so this time she wishes to draw a pattern as:-
//        *****
//        ****
//        ***
//        **
//        *
//        Since Sara does not know how to code, help her to draw this pattern.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Triangle() that takes no parameters.
//        Output
//        Print the pattern as shown in the example.
//        Example
//        Sample Output:-
//        *****
//        ****
//        ***
//        **
//        *