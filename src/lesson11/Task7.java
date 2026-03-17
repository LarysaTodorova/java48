package lesson11;

import lesson5.superCalc.UserInput;

public class Task7 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int numberOfIter = userInput.inputInteger("Введите количество итерраций:");

        for (int i = 0; i < numberOfIter; i++) {
            int userInt = userInput.inputInteger("Введите целое число:");

            if (userInt >= 0){
                System.out.println("Число положительное:");
            }else {
                System.out.println("Число отрицательное:");
            }


        }
    }

}
