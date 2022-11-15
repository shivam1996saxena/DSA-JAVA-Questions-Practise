package RecursionPracticeQuestions;

public class recursion_pratice_questions {
    public static void main(String[] args) {
        int [] arr = {1,-1,-4,-1,-8,99,4,-8};
        System.out.println(sumOfPositiveInArray(arr,7));
    }


    // ques -> 5 Given an Array of +ve & -ve numbers, return sum of all the +ve numbers
    static int sumOfPositiveInArray(int [] arr, int i){
      if (i==0){
          return arr[i];
      }
      if (arr[i]<0){
          arr[i] = 0;
      }
      return sumOfPositiveInArray(arr, i-1) + arr[i];
    }
}
