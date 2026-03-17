package practice14;

import lesson5.superCalc.UserInput;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Random random = new Random();

        int arraySize = userInput.inputInteger("Ввудите длину массива:");
        int[] arrayInt = new int[arraySize];

        int min = userInput.inputInteger("Введите начало массива:");
        int max = userInput.inputInteger("Введите конец массива:");

        for (int i = 0; i < arrayInt.length; i++) {
            int myRandom = random.nextInt(min,max);
            arrayInt[i] = myRandom;

        }
        System.out.println(Arrays.toString(arrayInt));

    }

}
