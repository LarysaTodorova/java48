package homework40.exception;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
         "Парсинг чисел": Создайте программу, которая запрашивает у пользователя строку
         и пытается преобразовать её в целое число с помощью Integer.parseInt().
         Используйте обработку исключений для перехвата NumberFormatException,
         если введённая строка не может быть преобразована в число, и выводите соответствующее сообщение.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line: ");
        try {

            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered a number: " + number);

        } catch (NumberFormatException exception) {
            System.out.println("Data entry error : " + exception.getMessage());
        }
    }
}
