package lesson44;

import static java.lang.Integer.MAX_VALUE;

public class Task2 {

// посчитать факториал числа
// 1 -> 1 (1)
// 2 -> 2 (1 * 2)
// 3 -> 6 (1 * 2 * 3)
// 4 -> 24 (1 * 2 * 3 * 4)
//...
// факториал 0 -> 1
// факториал отрицательных чисел -> 1

    public static void main(String[] args) {
        int x = 0;
        System.out.println(factorial(x));

        x = -1;
        System.out.println(factorial(x));

        x = 1;
        System.out.println(factorial(x));

        x = 2;
        System.out.println(factorial(x));

        x = 4;
        System.out.println(factorial(x));

        x = 100;
        System.out.println(factorial(x));

        x = 70;
        System.out.println(factorial(x));

    }

    public static int factorial(int x) {
        if (x <= 0) {
            return 1;
        }
        int y = 1;

        int factorial = 1;

        while (y < x) {
            y = y + 1;
            factorial = factorial * y;
        }
        return factorial;
    }
}
