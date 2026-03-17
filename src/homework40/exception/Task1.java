package homework40.exception;

import lesson5.superCalc.UserInput;

public class Task1 {
    public static void main(String[] args) {
        /*
         "Деление чисел": Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
          Используйте обработку исключений, чтобы обрабатывать случаи, когда второе число равно нулю,
          выводя соответствующее сообщение об ошибке.
         */

        UserInput userInput = new UserInput();

        int x = userInput.inputInteger("Enter a first number");
        try {
            int y = userInput.inputInteger("Enter a second number");
            System.out.println("The rersult of divide is: " + divide(x, y));

        } catch (ArithmeticException exception) {
            System.out.println("An error occurred:  " + exception.getMessage());

            System.out.println("The program finished the work. ");

        }
    }

    public static double divide(int x, int y) {
        return x / y;
    }
}
