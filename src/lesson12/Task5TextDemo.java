package lesson12;

import lesson5.superCalc.UserInput;

public class Task5TextDemo {
    public static void main(String[] args) {
        /*
        У вас есть текст.

Требуется - убрать ВСЕ специальные символы, такие как: "(",")","@"
(методом replace не пользоваться!!!)
         */
Task5Text task5Text = new Task5Text();
String specialText = " This is ( a text ) without special @ symbols ; ";

String cleanText = task5Text.textWithoutSpecialSymbols(specialText);

        System.out.println("Old text : " + specialText);
        System.out.println("New text : " + cleanText);


    }
}
