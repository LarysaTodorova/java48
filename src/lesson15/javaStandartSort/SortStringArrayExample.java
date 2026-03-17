package lesson15.javaStandartSort;

import java.util.Arrays;

public class SortStringArrayExample {

    public static void main(String[] args) {

        String[] stringArray = {"Sunday" , "Monday", "Thursday", "Wednesday", "Tuesday", "Friday", "Suturday",};


        System.out.println(Arrays.toString(stringArray));

        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray));

    }
}
