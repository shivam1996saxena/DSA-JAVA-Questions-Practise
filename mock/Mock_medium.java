package mock;

import java.util.ArrayList;

public class Mock_medium {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int x = 9;
       ArrayList<Integer> list = triplets(arr,x);
        for (int i = 0,c = 1;i < list.size();c++, i++) {
            if (c <=3) {
                System.out.print(arr[list.get(i)] + " ");
            }
            else {
                System.out.println();
                System.out.print(arr[list.get(i)] + " ");
                c = 1;
            }
        }
    }
    static void implementingMergeSort(int [] arr, int s, int e){
        if (e - s == 1){
            return;
        }
        int mid = s + (e -s)/2;
        implementingMergeSort(arr,s,mid);
        implementingMergeSort(arr,mid,e);
        merge(arr,s,mid,e);
    }
    private static void merge(int [] arr, int s, int mid, int e){
        int [] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e){
            if (arr [i] < arr [j]){
                mix [k] = arr[i];
                i++;
            }
            else {
                mix [k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix [k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix [k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
    static ArrayList<Integer> triplets (int [] arr, int x){
        // 1 2 3 4 5 6
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = i+1;
        int k = j+1;
        //1 2 3 4 5 6
        while (i < arr.length-2){
            if ((arr[i]+arr[j]+arr[k])==x){
                list.add(i);
                list.add(j);
                list.add(k);
                k++;
            }
            else {
                k = k+1;
            }
            if (k == arr.length){
                j++;
                k = j+1;
            }
            if (j == arr.length-1){
                i++;
                j = i+1;
                k = j+1;
            }
        }
        return list;
    }
}
