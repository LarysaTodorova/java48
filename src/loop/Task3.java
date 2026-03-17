package loop;

import lesson5.superCalc.UserInput;

public class Task3 {
    /*
    Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.
     */

    public static void main(String[] args) {
        UserInput userInput = new UserInput();


        int sum = 0;
        boolean condition = true;

        while (condition){
            int number = userInput.inputInteger("Ведите целое число отрицательное -выход");
            if (number >= 0) {
                sum = sum + number;
            } if (number < 0 ){
                    condition = false;

        }

    }
        System.out.println(sum);

}}
