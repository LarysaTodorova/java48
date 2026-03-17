package practice12;

import lesson5.superCalc.UserInput;

public class Task2 {
    public static void main(String[] args) {
        /*
        Напишите метод для вычисления факториала числа (произведение ВСЕХ чисел от 1 до заданного числа)



Например: 5! = 1 * 2 * 3 * 4 * 5;
         */

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите целое число:");
        int factorial = 1;

        for (int i = 1; i <= number ; i++) {
             factorial = factorial * i;

        }
        System.out.println(factorial);


    }
}
