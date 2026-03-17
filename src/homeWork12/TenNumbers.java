package homeWork12;

import lesson5.superCalc.UserInput;

public class TenNumbers {
    /*
    Напишите программу, которая запрашивает у пользователя 10 чисел и необходимо найти наибольшее число из них.
     */

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int numberOfIteration = userInput.inputInteger("Введите количество итераций (10):");

        int max = 0;


        for (int i = 0; i < numberOfIteration ; i++) {
            int number = userInput.inputInteger("Введите целое число:");
            if (number > max){
                max = number;
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
