package homework44;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        final int[] finalArray = {1, 2, 3};

        finalArray[0] = 10;

        System.out.println("Modified array: ");

        for (int number : finalArray) {

            System.out.print(number + ", ");

        }

        System.out.println();

        final List<String> finalList = new LinkedList<>();
        finalList.add("Hallow");
        finalList.add("World!");
        System.out.println(finalList);


        final Map<String, Integer> finalMap = new HashMap<>();
        finalMap.put("One", 1);
        finalMap.put("Two", 2);
        System.out.println(finalMap);

        finalList.add("Java!");
        finalMap.put("Three", 3);

        System.out.println("Modified list: "+ finalList);
        System.out.println("Modified map: " + finalMap);

    }
}
