package loop;

import lesson5.superCalc.UserInput;

public class Task6Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Task6 task6 = new Task6();


        int number = userInput.inputInteger("Введите число");
        int sum = task6.evenNumbers(number);
        System.out.println("Сумма четных чисел " + sum);

    }
}
