package lesson45;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
        Найти длину самой длинной последовательности одинаковых чисел в списке.
        1, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 7, 7, 7, 7, 7, 7, 7, 9, 9, 9, -1, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
         */
        int x = findLongestSequence(List.of(1, 2, 2, 3, 3, 1, 1, 1, 1));
        System.out.println(x);

    }

    public static int findLongestSequence(List<Integer> numbers) {
        int max = 0;

        if ((numbers.size() <= 1)) {
            return numbers.size();
        }
        int counter = 0;
        for (int i = 0; i < numbers.size() -1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                counter++;

            } else {
                if (counter > max) {
                    max = counter;
                }

                counter = 1;
            }
        }
        if (counter > max) {
            max = counter;
        }

        return max;
    }
}
