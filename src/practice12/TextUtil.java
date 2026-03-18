package practice12;

public class TextUtil {

    public String textWithoutSpecialSymbols(String text) {
        String resultText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != '(' && currentChar != ')' && currentChar != '@') {
                resultText = resultText + currentChar;
            }
        }
        return resultText;
    }
}
