package practice;

import lesson5.superCalc.UserInput;

import java.util.Scanner;

public class Task2New {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String firstWord = userInput.inputText("Enter a fist word");
        String secondWord = userInput.inputText("Enter a second word:");
        int halfFirstWord = firstWord.length()/2;
        int halfSecondWord = secondWord.length()/2;
        String newWord = firstWord.substring(0,halfFirstWord) + secondWord.substring(halfSecondWord);
        System.out.println("New word: " + newWord);










    }
}
