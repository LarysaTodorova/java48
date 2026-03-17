package homeworkProject.task1;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPractice {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int values : numbers) {
            System.out.print(values + " ,");
        }
    }
}
