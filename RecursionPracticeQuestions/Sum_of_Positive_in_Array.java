package RecursionPracticeQuestions;

public class Sum_of_Positive_in_Array {
    public static void main(String[] args) {
        int [] arr = {1,-1,-4,-1,-8,99,4,-8};
        System.out.println(sumOfPositiveInArray(arr,0));
    }
    // ques -> 5 Given an Array of +ve & -ve numbers, return sum of all the +ve numbers
    static int sumOfPositiveInArray(int [] arr, int i){
        if (i==arr.length){
            return 0;
        }
        if (arr[i]>0){
            return sumOfPositiveInArray(arr,i+1)+arr[i];
        }
        else return sumOfPositiveInArray(arr,i+1);
    }
}
