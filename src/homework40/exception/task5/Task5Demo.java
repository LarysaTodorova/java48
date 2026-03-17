package homework40.exception.task5;

import java.util.Scanner;

public class Task5Demo {
    public static void main(String[] args) {
        /*
        "Собственное исключение":         
        Создайте свой класс исключения, который выбрасывается, когда пользователь вводит отрицательное число, например,
        NegativeNumberException. Напишите метод, который запрашивает у пользователя число и выбрасывает это исключение,
        если число отрицательное.
        В основной программе используйте этот метод и обработайте исключение, выводя предупреждение пользователю.
         */

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a number");
            int number = scanner.nextInt();
            checkError(number);
            System.out.println("Your nunber: " + number);

        } catch (NegativeNumberException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    public static void checkError(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Your number is less than 0 ");
        }

    }
}
