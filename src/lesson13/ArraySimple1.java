package lesson13;

import java.util.Arrays;

public class ArraySimple1 {
    public static void main(String[] args) {

        int [] array = new int[3];

        array[0] = 6;
        array[1] = 9;
        array[2] = 6;

        System.out.println(Arrays.toString(array));

        System.out.println(array[0] + array[1] + array[2]);

        array[2] = 10;

        System.out.println(array[0] + array[1] + array[2]);

        array[0] = 10;
        System.out.println(array[0] + array[1] + array[2]);

        System.out.println(array[0] == array[1]);
        System.out.println(array[0] == array[2]);


        String[] strings = {"word1", "word2", "word3", "word1"};

        System.out.println(Arrays.toString(strings));

        System.out.println(strings[0].equals(strings[3]));
    }
}
