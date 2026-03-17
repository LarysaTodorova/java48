package lesson11;

import lesson5.superCalc.UserInput;

public class Task5 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите число:");

        int sum = 0;
        int counter = 0;

        while (counter <= number){
            if (counter % 2 == 0) {
                sum = sum + counter;
            }
            counter++;
        }
        System.out.println("Сумма всех четных чисел = " + sum);



    }
}
