package practiceCodeWars;

public class Solution {
    public static String[] stringToArray(String sentence) {
        //your code;
        if(sentence == null || sentence.trim().isEmpty()) {
            return new String[0];
        }

        return sentence.trim().split("\\s+ ");

    }

    public static void main(String[] arg) {

        String sentence = " I like Java ";
        String[] words = stringToArray(sentence);

        for(String word : words) {
            System.out.println(word);
        }
    }
}
