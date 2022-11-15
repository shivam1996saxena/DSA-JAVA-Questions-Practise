package RecursionPracticeQuestions;

public class Check_isSorted_Array {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,6,7,8,9};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int [] arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&isSorted(arr,index+1);
    }
}
