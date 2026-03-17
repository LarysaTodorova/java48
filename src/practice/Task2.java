package practice;

import lesson5.superCalc.UserInput;

public class Task2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String text = userInput.inputText("Enter a text ");

        System.out.println("First word: " + text.substring(0,3));

        System.out.println("Second word: " + text.substring(9));

        System.out.println("New word: " + text.substring(0,3) + text.substring(9));


    }
}
