package homework40.exception;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        "Индекс вне границ массива": Напишите программу, которая создаёт массив целых чисел заданного размера,
        заполненный случайными числами.
        Затем программа должна запрашивать у пользователя индекс и пытаться вывести значение элемента массива по этому индексу.
        Используйте обработку исключений для перехвата ArrayIndexOutOfBoundsException,
        если указанный индекс выходит за пределы массива.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        System.out.println("Array");
        for (int number : numbers) {
            System.out.println(number);
        }
        try {

            System.out.println("Enter an index of array:");
            int index = scanner.nextInt();
            System.out.println("Value by index " + index + " is " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index is out of bounds: " + exception.getMessage());
        }
    }
}
