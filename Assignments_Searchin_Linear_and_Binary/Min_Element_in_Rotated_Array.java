package Assignments_Searchin_Linear_and_Binary;

public class Min_Element_in_Rotated_Array {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        System.out.println(minELE(arr));
    }
    static int minELE(int [] arr){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (mid != e && arr[mid]>arr[mid]+1){
                return arr[mid+1];
            }
            if (arr[mid] < arr[mid+1]){
                s++;
            }
            if (mid == e){
                e--;
            }
        }
        return -1;
    }
}
