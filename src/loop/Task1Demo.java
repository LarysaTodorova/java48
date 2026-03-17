package loop;

import lesson5.superCalc.UserInput;

public class Task1Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Task1 task1 = new Task1();

        int number = userInput.inputInteger("Введите целое число:");

        System.out.println("Сумма четных чисел = " + task1.sumNumbers(number));


    }
}
