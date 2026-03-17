package sorting;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arrayForSort = {250,67,999,525,666,10,3,500,777};

        System.out.println("Array befor sorting:  ");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("========================");


        boolean notSorted = true;
        int temp;

        while (notSorted) {
            notSorted = false;

            for (int i = 0; i < arrayForSort.length - 1; i++) {
                if (arrayForSort[i] < arrayForSort[i + 1]) {
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i + 1];
                    arrayForSort[i + 1] = temp;
                    notSorted = true;
                }

                System.out.println(Arrays.toString(arrayForSort));
            }
            System.out.println("Array after sorting: ");
            System.out.println(Arrays.toString(arrayForSort));
        }
    }
}
