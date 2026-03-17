package lesson14;

import lesson5.superCalc.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    /*
    1) запросить и получить от пользователя длину массива
    2) создать массив нужной длины
    3) запросить от пользователя интервал значений для заполнения массива данными
    4) заполнить массив случайными числами в указанном интервале
    5) вывести информацию о массиве пользователю
     */

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Random random = new Random();

        int arraySize = userInput.inputInteger("Введите длину массива:");
        int[] arrayInt = new int[arraySize];

        int min = userInput.inputInteger("Введите начало интервала значений:");
        int max = userInput.inputInteger("Введите конец интервала значений:");

        for (int i = 0; i < arrayInt.length; i++) {
            int myRandom = random.nextInt(min,max);
            arrayInt[i] = myRandom;

        }

        System.out.println(Arrays.toString(arrayInt));

    }
}
