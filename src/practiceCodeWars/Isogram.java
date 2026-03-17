package practiceCodeWars;

import java.util.HashSet;

public class Isogram {
    public static boolean  isIsogram(String str) {
        // ...
        str = str.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(char letter : str.toCharArray()) {
            if(set.contains(letter)) {
                return false;
            }
            set.add(letter);
        }

        return true;

    }

    public static void main(String[] arg) {
        System.out.println(isIsogram("Kjhfmnxzpqw"));
    }
}
