package practiceCodeWars;

public class MinMaxFinder {
    /*
    Напишите функцию, которая возвращает как минимальное, так и максимальное число из указанного списка/массива.
     */
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array can not be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int number : arr) {

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 15, 1};
        int[] result = minMax(array);

        System.out.println("min result: " + result[0]);
        System.out.println("max result: " + result[1]);

    }
}
