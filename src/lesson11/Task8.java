package lesson11;

import lesson5.superCalc.UserInput;

public class Task8 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String text = userInput.inputText("Введите текст:");

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            System.out.println("Буква в тексте с индексом " + i + " : " + currentChar);

        }
        System.out.println( "-- с помощью --while");

        int counter = 0;
        while (counter < text.length()){
            char currentChar = text.charAt(counter);
            System.out.println("Буква в тексте с индексом " + counter + " : " + currentChar);
            counter++;
        }
    }

}
