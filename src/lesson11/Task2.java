package lesson11;

import lesson5.superCalc.UserInput;

public class Task2 {

    public static void main(String[] args) {

        int x;
        int y;
        int result;

        UserInput userInput = new UserInput();
        boolean condition = true;

        while (condition){
            System.out.println("Введите целое число:");
             x = userInput.inputInteger("Введите первое число:");
             y = userInput.inputInteger("Введите второе число:");

             result = x + y;
            System.out.println("Сумма чисел = " + result);

            if (result > 100){
                condition = false;

            }

        }
        System.out.println("Цикл завершил свою работу!");

    }

}
