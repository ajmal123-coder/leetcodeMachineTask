//. Merge Strings Alternately
//
//Example :-
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
public class Main {
    public static void main(String[] args) {
        Concat c = new Concat();
        System.out.println(c.abc("abc","pqr"));
    }

}
class Concat{
    public StringBuilder abc(String str1, String str2){
        StringBuilder str = new StringBuilder();
        int len = 0;
        if (str1.length() >= str2.length()){
            len = str1.length();
        }else {
            len = str2.length();
        }
        for(int i = 0;i<=len-1;i++){
            str.append(String.valueOf(str1.charAt(i)));
            str.append(String.valueOf(str2.charAt(i)));
        }
        return str;
}}