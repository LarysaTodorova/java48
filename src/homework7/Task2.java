package homework7;

import lesson5.superCalc.UserInput;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*Введите 2 слова, воспользуйтесь сканером.
        Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
        Если количество букв в слове - нечетное, то небольшое количество букв в слове не важно. Распечатать на консоли.
        */

        UserInput userInput = new UserInput();

        String text = userInput.inputText("Enter a text");
        System.out.println("Your text is: " + text);

        String substringWord1 = text.substring(0,3);
        System.out.println("Word 1: " + substringWord1);
        String substringWord2 = text.substring(9);
        System.out.println("Word 2: " + substringWord2);
        String newWord = substringWord1+substringWord2;
        System.out.println("New word: " +  newWord);





    }

}
