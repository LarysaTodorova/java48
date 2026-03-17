package practice;

import lesson5.superCalc.UserInput;

public class If {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String word = userInput.inputText("Введите слово: ");


        if (word.length() < 5){
            System.out.println("Вы ввели слово меньше 5 символов:");
        }else {
            System.out.println("Вы ввели: " +  word);

        }
    }
}
