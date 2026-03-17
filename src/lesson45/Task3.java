package lesson45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    /*
    Найти сумму неуникальных чисел в списке
    1, 2, 2, 3, 4, 4, 5
     */

    public static int sumOfNonUniqueNumbers(List<Integer> numbers) {
        List<Integer> notUniqueNumbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            // Проверяем, встречается ли число еще раз в списке
            if (numbers.indexOf(currentNumber) != numbers.lastIndexOf(currentNumber)
                    && !notUniqueNumbers.contains(currentNumber)) {
                notUniqueNumbers.add(currentNumber);
            }
        }

        // Считаем сумму всех неуникальных чисел
        for (int number : notUniqueNumbers) {
            int occurrences = Collections.frequency(numbers, number);
            sum += number * occurrences;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 2, 3, 4, 4, 5);
        int sum = sumOfNonUniqueNumbers(array);
        System.out.println(sum);
    }
}
