package practiceCodeWars;

public class AlphabetPosition {
    public static String findPosition(char letter) {
        int position = letter - 'a' + 1; // Calculate position of the letter in the alphabet
        return "Position of alphabet: " + position;
    }

    public static void main(String[] args) {
        char input = 'l'; // Example input
        System.out.println(findPosition(input));
    }
}
