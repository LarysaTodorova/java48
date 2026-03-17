package homework29.task1;

import java.util.HashMap;
import java.util.Map;

public class Words {
    public static void main(String[] args) {

        String text = "One, twenty one, two! Sixty two, five, & one, two, five!";

        text = text.replaceAll(",","");
        text = text.replaceAll("!", "");
        text = text.replaceAll("&", "");
        text = text.toLowerCase();

        Map<String, Integer> mapWords = wordsCounter(text);

        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> wordsCounter(String text) {
        Map<String, Integer> mapWords = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                if (mapWords.containsKey(word)) {
                    int counter = mapWords.get(word);
                    counter++;
                    mapWords.put(word,counter);
                }else {
                    mapWords.put(word,1);
                }
            }
    }
        return mapWords;
}
}
