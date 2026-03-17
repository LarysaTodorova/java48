package practice;

import java.util.Scanner;

public class ScannerWork {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int x = myScanner.nextInt();


        System.out.println("Введите второе число:");
        int y = myScanner.nextInt();
        System.out.println("Результат сложения = " + ( x + y ));
    }
}
