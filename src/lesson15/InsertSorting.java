package lesson15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSorting {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};


            System.out.println("Array befor sorting:");
            System.out.println(Arrays.toString(arrayForSort));
            System.out.println("---------------------");

            for (int i = 0; i < arrayForSort.length; i++) {

                System.out.println("Iteration " + i);
                System.out.println("Start iteration " + Arrays.toString(arrayForSort));

                int currentElement = arrayForSort[i];

                int j = i - 1;

                while ((j >= 0) && (currentElement < arrayForSort[j])) {
                    arrayForSort[j + 1] = arrayForSort[j];
                    j--;
            }
                arrayForSort[j + 1] = currentElement;
                System.out.println("End iteration " + Arrays.toString(arrayForSort));

        }
        System.out.println("----------------");
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(arrayForSort));


    }
}
