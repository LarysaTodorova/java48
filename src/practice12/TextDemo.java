package practice12;

public class TextDemo {
    /*
    Задание 5.

У вас есть текст.

Требуется - убрать ВСЕ специальные символы, такие как: "(",")","@"

(методом replace не пользоваться!!!)

     */

    public static void main(String[] args) {

TextUtil textUtil =  new TextUtil();
String newText = "This is ( a text ) without  special @ symbols ";
String cleanText = textUtil.textWithoutSpecialSymbols(newText);

        System.out.println(cleanText);
    }

}
