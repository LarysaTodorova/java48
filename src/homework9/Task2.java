package homework9;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int x1 = random.nextInt(100);
        int x2 = random.nextInt(100);
        int x3 = random.nextInt(100);
        int x4 = random.nextInt(100);

        System.out.println("Первое число: " + x1);
        System.out.println("Второее число: " + x2);
        System.out.println("Третье число: " + x3);
        System.out.println("Четвертое число: " + x4);

        int max = x1;

        if (x2 > max){
            max = x2;
        }if (x3 > max){
            max = x3;

        }if (x4 > max){
            max = x4;

        }
        System.out.println("Максимальное число: " + max);


    }
}
