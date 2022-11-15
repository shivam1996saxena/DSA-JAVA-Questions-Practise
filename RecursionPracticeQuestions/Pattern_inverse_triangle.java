package RecursionPracticeQuestions;

public class Pattern_inverse_triangle {
    public static void main(String[] args) {
        invTrianle(5,0);
    }
    static void invTrianle(int row,int col){
        if (row == 0){
            return;
        }
        if (row > col){
            System.out.print("*");
            invTrianle(row,col+1);
        }
        else {
            System.out.println();
            invTrianle(row-1,0);
        }
    }
}
