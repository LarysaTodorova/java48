package lesson11;

import lesson5.superCalc.UserInput;

public class Task4 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        boolean condition = true;
        int sum = 0;

        while (condition){
            int number = userInput.inputInteger("Введите любое положительное число(отрицательное-выход)");
            if (number>=0){
               sum= sum+number;
            }else {
                condition = false;
                System.out.println("Сумма всех чисел = " + sum);
            }
        }

    }

}
