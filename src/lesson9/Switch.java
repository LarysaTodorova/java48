package lesson9;

import lesson5.superCalc.UserInput;

public class Switch {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String word = userInput.inputText("Введите любое английское слово:");

        switch (word){
            case "coffee":
                System.out.println("Перевод этого слова " + word + " - кофе");
                break;
            case "tea":
                System.out.println("Перевод слова : " + word + "- чай");
                break;
            case "hallow":
                System.out.println("Перевод слова : " + word + "-привет");
                break;
            default:
                System.out.println("Перевод этого слова я пока еще не знаю");

        }

    }
}
