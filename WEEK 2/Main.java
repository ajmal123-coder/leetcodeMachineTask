//. Merge Strings Alternately
//
//Example :-
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//. Merge Strings Alternately
//
//Example :-
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
public class Main {
    public static void main(String[] args) {
        Concat c = new Concat();
        System.out.println(c.abc("abc","pqryht"));
    }
}
class Concat{
    public StringBuilder abc(String str1, String str2){
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
       while (i< str1.length() || j < str2.length()){
           if (i < str1.length()){
               str.append(String.valueOf(str1.charAt(i)));
               i++;
           }
           if (j < str2.length()){
               str.append(String.valueOf(str2.charAt(j)));
               j++;
           }
       }
        return str;
}}