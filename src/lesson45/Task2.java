package lesson45;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    /*
    Найти количество уникальных чисел в списке.
    [1, 2, 2, 3, 4, 4, 5]
     */

    public static int countUniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        int uniqueCount = countUniqueNumbers(numbers);
        System.out.println(uniqueCount);
    }
}
