package RecursionPracticeQuestions;

public class Linear_search_byRecursion {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6,18,9};
        System.out.println(search(arr,188,0));
    }
    static int search(int [] arr,int find,int index){
        if (index== arr.length-1){
            return -1;
        }
        if (arr[index] == find){
            return index;
        }
        return search(arr,find,index+1);
    }
}
