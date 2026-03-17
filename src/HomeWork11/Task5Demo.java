package HomeWork11;

import lesson5.superCalc.UserInput;

public class Task5Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите целое число");

        Task5 task = new Task5();

        int even = task.countEven(number);
        System.out.println("Количество четных чисел = " + even);
        int odd = task.countOdd(number);
        System.out.println("Количество нечетных чисел = " + odd);


    }
}
