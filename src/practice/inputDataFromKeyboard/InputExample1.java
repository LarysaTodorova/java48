package practice.inputDataFromKeyboard;

import java.util.Scanner;

public class InputExample1 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int xInt = myScanner.nextInt();
        System.out.println("Вы ввели число: " + xInt);


        System.out.println("Введите дробное  число: ");
        double xDouble = myScanner.nextDouble();
        System.out.println("Вы ввели число: " + xDouble);


        myScanner.nextLine();
        System.out.println("Введите текст: ");
        String xString = myScanner.nextLine();
        System.out.println("Вы ввели текст: " + xString);





    }
}
