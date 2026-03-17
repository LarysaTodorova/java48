package lesson11;

import lesson5.superCalc.UserInput;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

        int x;
        int y;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        while (result<100){
            System.out.println("Введите целое число");
            System.out.println("Введите первое число");
            x = scanner.nextInt();
            System.out.println("Введите второе число");
            y = scanner.nextInt();
            result = x + y;
            System.out.println("Сумма чисел = " + result);

        }
        System.out.println("Цикл завершил свою работу!");

    }

}
