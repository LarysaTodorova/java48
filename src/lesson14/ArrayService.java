package lesson14;

import java.util.Random;

public class ArrayService {

    /*
    1) запросить и получить от пользователя длину массива
    2) создать массив нужной длины
    3) запросить от пользователя интервал значений для заполнения массива данными
    4) заполнить массив случайными числами в указанном интервале
    5) вывести информацию о массиве пользователю
     */

    public int[] createIntArray(int arraySize){
        int[] newArray = new int[arraySize];
        return newArray;
    }

    public void fillArrayByRandom(int[] workingArray,int startValue,int endValue) {

        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            int myRandom = random.nextInt(startValue, endValue);
            workingArray[i] = myRandom;

        }
    }
    public void printArrayData(int[] workingArray) {
        System.out.println("Данные элементов массива:");
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println(workingArray[i] + ", ");

        }
    }
}
