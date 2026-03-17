package homeWork12;

import lesson12.TaskClass;
import lesson5.superCalc.UserInput;

public class NumbersDemo {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Numbers numbers = new Numbers();
        int number = userInput.inputInteger("Введите положительное число:");

        int numberResult = numbers.method(number);
        System.out.println("Сумма четных чисел = " + numberResult);
    }
}
