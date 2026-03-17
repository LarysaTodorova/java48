package loop;

import lesson5.superCalc.UserInput;

public class NumberOfIteration {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int numberOfIterations = userInput.inputInteger("Введите количество итераций");

        for (int i = 0; i < numberOfIterations ; i++) {
            int userint = userInput.inputInteger("Введите целое число");

            if (userint >= 0){
                System.out.println("Число положительное");

            }else {
                System.out.println("Число отрицательное");
            }

        }

    }
}
