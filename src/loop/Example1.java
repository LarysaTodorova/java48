package loop;

import lesson5.superCalc.UserInput;

public class Example1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int x;
        int y;
        int result = 0;

        while (result <= 100){
            System.out.println("Введите два целых числа:");
            x = userInput.inputInteger("Введите первое число:");
            y = userInput.inputInteger("Введите второе число:");

            result = x + y;
            System.out.println("Сумма этих чисел = " + result);
        }
        System.out.println("Цикл завершил свою работу!");
}
}
