package RecursionPracticeQuestions;

public class Bubble_sort_via_recursion {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubble(arr,4,0);
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
    static void bubble(int [] arr,int r,int c){
        if (r < 0){
            return;
        }
        if (r > c){
            if (arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr,r,c+1);
        }
        else {
            bubble(arr,r-1,0);
        }
    }
}
