package lesson12;

import lesson5.superCalc.UserInput;

public class TaskMethod {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        TaskClass taskClass = new TaskClass();
        int numbers = userInput.inputInteger("Введите положительное число:");

        int numberResult = taskClass.metod(numbers);
        System.out.println("Сумма четных чисел = " + numberResult);
    }
}
