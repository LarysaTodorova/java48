package lesson7;

public class StringOperations {
    public static void main(String[] args) {

        String string1 = "      ";
        String text = "This is my text";
        String text2 = "";

        int myTextLength = text.length();
        System.out.println("Длина моей строки");
        System.out.println(myTextLength);


        boolean myStrEmpty = string1.isEmpty();
        System.out.println("Проверка строки на наличие любых символов");
        System.out.println(myStrEmpty);


        boolean isMyStrBlank = text2.isBlank();
        System.out.println(isMyStrBlank);


    }
}
