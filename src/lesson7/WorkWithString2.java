package lesson7;

import java.util.Locale;

public class WorkWithString2 {
    public static void main(String[] args) {

        String text = "This is my first text";

        System.out.println(text);


        System.out.println("Длина строки = " + text.length());

        System.out.println("Получение символа из строки по его индексу(порядковый номер)");
        char symbol1 = text.charAt(11);
        System.out.println(symbol1);

        int lustIndex = text.length()-1;
        System.out.println(lustIndex);


        // ---получить текст а (не один символ) из моей основной строки ----


        String substringText1 = text.substring(13);
        String substringText2 = text.substring(5, 15);

        System.out.println(substringText1);
        System.out.println(substringText2);

        String subStringText3 = text.substring(5, text.length() -1);
        System.out.println(subStringText3);


        System.out.println("--проверка вхождения текста в другую строку---");
        String searchText = "first";
        boolean resultCheckContains = text.contains(searchText);
        System.out.println("Contains result is - " + resultCheckContains);


        System.out.println("-- приведение текста к одному регистру----");

        String textToUpperCase = text.toUpperCase(Locale.ROOT);
        System.out.println(textToUpperCase);

        String textToLowerCase = text.toLowerCase(Locale.ROOT);
        System.out.println(textToLowerCase);







    }
}
