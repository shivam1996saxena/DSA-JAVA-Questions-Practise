package Arena_1D;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String a = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(a));
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> hash = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (hash.contains(sentence.charAt(i))){
                continue;
            }
            else {
                hash.add(sentence.charAt(i));
            }
        }
        if (hash.size()==26){
            return true;
        }
        return false;
    }
}