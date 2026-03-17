package practice45;

public class Task2 {

    public static int findShortestWord(String sentence) {

        String[] words = sentence.split(" ");

        int minLength = Integer.MAX_VALUE;

        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }

        return minLength;
    }

    public static void main(String[] args) {

        String sentence = "You and I are the best friends";
        int shortestWord = findShortestWord(sentence);
        System.out.println(shortestWord);
    }
}
