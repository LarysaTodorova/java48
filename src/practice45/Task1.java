package practice45;

public class Task1 {
    public static int findShortestWordLength(String sentence) {
        // Split the string by spaces to get each word
        String[] words = sentence.split(" ");

        // Initialize the minimum length with a large value
        int minLength = Integer.MAX_VALUE;

        // Iterate through each word to find the shortest one
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        // Example usage
        String sentence = "The quick brown fox jumped over the lazy dog";
        int shortestLength = findShortestWordLength(sentence);
        System.out.println(shortestLength);  // Output: 3
    }
}
