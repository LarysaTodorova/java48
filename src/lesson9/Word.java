package lesson9;

import lesson5.superCalc.UserInput;

public class Word {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String userWord = userInput.inputText("Enter a text");
        int x = userWord.length();
        if (x >= 5){
            System.out.println("You entered : " + userWord);
        }else
            System.out.println("You entered a word less than 5 letters!");

    }
}
