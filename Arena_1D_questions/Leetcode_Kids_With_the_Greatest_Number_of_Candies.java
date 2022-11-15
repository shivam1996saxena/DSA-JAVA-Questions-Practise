package Arena_1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Leetcode_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int [] ar = {2,3,5,1,3};
        System.out.print((kidsWithCandies(ar,3)));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
            boolean isGreater = false;
            int i = 0;
            while (i!=candies.length){
            int temp = candies[i] + extraCandies;
                for (int j = 0; j < candies.length; j++) {
                    if (temp >= candies[j]){
                        isGreater = true;
                    }
                    else {
                        isGreater = false;
                        break;
                    }
                }
                if (isGreater){
                    ans.add(true);
                }
                else {
                    ans.add(false);
                }
            i++;
        }
        return ans;
    }
}
