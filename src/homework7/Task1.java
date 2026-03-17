package homework7;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {

        /* 1 Создаю дизайн через new - Я изучаю Basic Java!
         2 Напишите метод, который принимается в качестве символа, передайте в этот метод, который используется в п. 1.
         3 Распечатайте последнюю символьную строку. использовать метод String.charAt().
         4. Проверьте, содержит ли ваша строка подстроку «Java». использовать метод String.contains().
         5 Замените все символы «а» на «о».
         6 Введите текст вверху регистрации.
         7 Преобразуйте текст в журнал регистрации.
         8 Вырезаем код Java c с помощью метода String.substring().
        */
        String text = new String("Я изучаю Basic Java !");
        System.out.println(text);

        System.out.println("Длина символа:  " + text.length() );
        System.out.println("Последняя символьная строка: " + text.charAt(20));
        System.out.println("Проверка подстроки 'Java': " + text.contains("Java"));
        System.out.println("Замена 'a' на 'o' : " + text.replace('a', 'o'));
        System.out.println("Преобразование в верхний регистр: " + text.toUpperCase());
        System.out.println("Преобразование в нижний регистр: " + text.toLowerCase(Locale.ROOT));
        System.out.println("Вырезаем код'Java: " + text.substring(15,19));




    }
}
