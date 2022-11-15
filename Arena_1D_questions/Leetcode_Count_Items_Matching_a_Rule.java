package Arena_1D;
// https://leetcode.com/problems/count-items-matching-a-rule/submissions/
import java.util.List;
import java.util.Objects;

public class Leetcode_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (Objects.equals(ruleKey, "color")){
            for (int i = 0; i < items.size(); i++) {
                    if (Objects.equals(items.get(i).get(1),ruleValue)){
                        count++;
                    }
            }
        }
        if (Objects.equals(ruleKey, "type")){
            for (int i = 0; i < items.size(); i++) {
                    if (Objects.equals(items.get(i).get(0),ruleValue)){
                        count++;
                    }
                }
            }
        if (Objects.equals(ruleKey, "name")){
            for (int i = 0; i < items.size(); i++) {
                if (Objects.equals(items.get(i).get(2),ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}
