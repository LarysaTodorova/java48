package lesson15.javaStandartSort;

import java.util.Arrays;

public class SortStringArrayExample2 {
    public static void main(String[] args) {

        String[] stringArray = {"01", "02", "03", "11", "15", "21", "31"};


        System.out.println(Arrays.toString(stringArray));

        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray));

    }

}
