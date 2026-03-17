package lesson9;

import lesson5.superCalc.UserInput;

import java.util.Scanner;

public class Word2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное число");
        int x = scanner.nextInt();

        if (x>0 && x/2 ==0 ){
            System.out.println(" Четное положительное " + x);

        }else if (x < 0 && x /2 == 0){
            System.out.println("Четное отрицательное " + x);
        } else {
            System.out.println(" Не четное  " + x);

        }
    }
}
