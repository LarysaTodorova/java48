package loop;

import lesson5.superCalc.UserInput;

public class Example4 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        boolean condition = true;
        int sum = 0;

        while (condition){
            int number = userInput.inputInteger("Введите целое число (отрицательное) - выход");

            if (number >= 0){
                sum = sum + number;

            }if (number < 0 ){

                condition = false;
            }
        }
        System.out.println("Сумма чисел = " +  sum );
    }
}
