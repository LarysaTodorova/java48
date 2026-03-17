package homework40.exception;

import lesson5.superCalc.UserInput;

import java.util.InputMismatchException;

public class Task2 {
    public static void main(String[] args) {
        /*
        "Обработка пользовательского ввода": Создайте программу, которая запрашивает у пользователя возраст.
        Программа должна анализировать введённые данные и проверять, что возраст является положительным целым числом.
        Используйте блок try-catch для перехвата исключения InputMismatchException, которое может возникнуть,
        если пользователь вводит не числовые данные.
        В случае возникновения исключения, программа должна выводить сообщение о том,
        что введены некорректные данные и предлагать пользователю ввести данные заново.
         */

        UserInput userInput = new UserInput();

        try {
            int age = userInput.inputInteger("Enter your age");
            System.out.println("Your age is: " + age);

        } catch (InputMismatchException exception) {
            System.out.println("Incorrect data entered: " + exception.getMessage());
            System.out.println("Please, try again");

        }
    }
}
