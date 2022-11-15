package Arena_1D;

public class Missing_element {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        System.out.print(missingEle(arr));
    }


    static int missingEle(int [] arr){
        int [] mix = new int [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr[i]){
                mix[i] = arr[i];
            }
        }
        for (int i = 0; i < mix.length; i++) {
            if(mix[i] == 0){
                return i+1;
            }
            else{
                continue;
            }
        }
        return -1;
    }
}

