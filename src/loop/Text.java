package loop;

import lesson5.superCalc.UserInput;

public class Text {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String textUser = userInput.inputText("Введите текст");

        for (int i = 0; i < textUser.length(); i++) {
            char currentChar = textUser.charAt(i);
            System.out.println("Буква " + i + ":" + currentChar);
        }


    }
}
