package HomeWork11;

import lesson5.superCalc.UserInput;

public class Task2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int count = userInput.inputInteger("Введите целое число:");

        if (count %2 == 0){
            System.out.println("Число сложное");
        }else {
            System.out.println("Чило простое");
        }
    }
}
