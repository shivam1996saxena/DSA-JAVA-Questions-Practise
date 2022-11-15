package RecursionPracticeQuestions;

public class Print_String_in_reverse_order {
    public static void main(String[] args) {
        revStr(4,"abcd");
    }
    //ques -> 4 Given a String, Your Task is to print the String in the reverse order
    static void revStr(int l,String str){
        int i = l-1;
        if (i<0){
            return;
        }
        System.out.print(str.charAt(i));
        revStr(l-1,str);
    }
}
