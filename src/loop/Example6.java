package loop;

import lesson5.superCalc.UserInput;

public class Example6 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int n = 0;
        int sum = 0;


        while (n >= 0) {
           n = userInput.inputInteger("Введите целое положительное число");
           if (n >= 0){
               sum = sum + n;
           }
            }
        System.out.println("Сумма чисел = " + sum);
        }

    }
