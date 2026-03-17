package practice;

import lesson5.superCalc.UserInput;

public class If2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int count = userInput.inputInteger("Введите число:");

        if (count > 0 && count/2 == 0){
            System.out.println("Число четное положительное:" + count);

        }else if (count < 0 && count/2 == 0){
            System.out.println("Четное  отрицательное " + count);

        }else {
            System.out.println("число не четное " + count);

        }

    }
}
