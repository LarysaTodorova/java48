package homeWork13;

import lesson5.superCalc.UserInput;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*
    массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строке.
Замените каждый элемент нечетным индексом на ноль.
Снова вы ведете массив на консоль в отдельной строке.
     */
    public static void main(String[] args) {

    Random random = new Random();
    int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i]  = random.nextInt(1,50);

        }

        System.out.println("Это наш массив:" +Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            if (i %2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Это обновленный массив:" +Arrays.toString(array));
    }


}
