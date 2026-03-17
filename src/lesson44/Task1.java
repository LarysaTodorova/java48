package lesson44;

public class Task1 {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println("*" + reversedWord(str) + "*");

        str = "";
        System.out.println("*" + reversedWord(str) + "*");

        str = " abc";
        System.out.println("*" + reversedWord(str) + "*");

        str = null;
        System.out.println("*" + reversedWord(str) + "*");

        str = "    ";
        System.out.println("*" + reversedWord(str) + "*");

    }
    // abc -> cba
    // "" -> ""
    // null -> avoid NullPointerException
    // " abc" -> "cba"
    // "    " -> "    "
    // начинать с крайних случаев, например Null - isBlank - trim - переворот строки

    public static String reversedWord(String word) {

        String reverseWord = "";

        if (word == null) {
            return null;
        } else if (word.isBlank()) {
            return word;
        } else {
            word = word.trim();
        }

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);

        }
        return reverseWord;
    }
}
