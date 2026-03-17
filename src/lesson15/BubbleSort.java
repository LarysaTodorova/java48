package lesson15;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};

        System.out.println(" Массив до сортировки:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("---------------------");


        boolean notSorted = true;

        int temp;

        while (notSorted) {

            notSorted = false;

            for (int i = 0; i < arrayForSort.length - 1; i++) {

                if (arrayForSort[i] > arrayForSort[i + 1]) {
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i + 1];
                    arrayForSort[i + 1] = temp;
                    notSorted = true;
                }
                System.out.println(Arrays.toString(arrayForSort));

            }
            System.out.println("-------------");
        }
        System.out.println("Массив ПОСЛЕ сортировки:");
        System.out.println(Arrays.toString(arrayForSort));

    }

}
