package lesson15;

import java.util.Arrays;

public class ChooseSort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};

        System.out.println("Array befor sorting:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("---------------------");

        for (int i = 0; i < arrayForSort.length; i++) {

            System.out.println("Iteration " + i);
            System.out.println("Start iteration " + Arrays.toString(arrayForSort));

            int min = arrayForSort[i];
            int minIndex = i;

            for (int j = i + 1; j < arrayForSort.length; j++) {
                if (arrayForSort[j] < min) {
                    min = arrayForSort[j];
                    minIndex = j;
                }
            }
            System.out.println(i + " элемент - " + arrayForSort[i] + " будет заменен на элемент с индексом " + minIndex + " его значение рвано " + min);

            int temp = arrayForSort[i];
            arrayForSort[i] = min;
            arrayForSort[minIndex] = temp;

            System.out.println("End iteration " + Arrays.toString(arrayForSort));

            }


        System.out.println("----------------");
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(arrayForSort));
    }
}
