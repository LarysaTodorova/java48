package lesson11;

import lesson5.superCalc.UserInput;

public class Task6 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int sum = 0;
        int number = 0;

        while (number >= 0) {
            number = userInput.inputInteger("Введите число:");

            if (number >= 0){
                sum = sum + number;
            }
        }
        System.out.println("Сумма всех чисел = " + sum);
    }
}
