package homeWork13;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*
    создать массив из 5 случайных целых чисел из интервала [10;99]
Вы поместите его на консоль в символ.
Определите и выведите на экран сообщение о том, что массив строго возрастающей последовательности.
     */
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10,99);

        }
        System.out.println("Это наш массив:" + Arrays.toString(array));

        boolean growingArray = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                growingArray = false;
                break;
            }
        }
        if (growingArray){
        System.out.println("Массив является строго возрастающим!");

    }else {
            System.out.println("Массив не является строго возрастающим!");
        }
}
}

