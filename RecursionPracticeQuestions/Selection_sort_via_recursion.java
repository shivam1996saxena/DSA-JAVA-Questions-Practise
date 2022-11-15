package RecursionPracticeQuestions;

public class Selection_sort_via_recursion {
    public static void main(String[] args) {
        int [] ar = {5,4,3,2,1};
        selectionSort(ar,ar.length,0,0);
        for (int e : ar){
            System.out.print(e + " ");
        }
    }
    static void selectionSort(int [] arr,int r,int c,int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]) {
                selectionSort(arr,r,c+1,c);
            }
            else {
                selectionSort(arr, r, c + 1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
