package lesson12;

import lesson5.superCalc.UserInput;

public class Task2 {
    public static void main(String[] args) {


    /*
    Напишите метод для вычисления факториала числа (произведение ВСЕХ чисел от 1 до заданного числа)

Например: 5! = 1 * 2 * 3 * 4 * 5;
     */
        UserInput userInput = new UserInput();
        double n = userInput.inputDouble("Ведите число для вычисления факториала:");
        double fact = 1;

        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }


}
