package loop;

import lesson5.superCalc.UserInput;

public class Example5 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int sum = 0;
        int n = userInput.inputInteger("Введите целое число от 0 до 100");
        int counter = 0;

        while (counter <= n){
            if (counter %2 ==0){
                sum = counter + sum;

            }
            counter++;
        }

        System.out.println("Сумма всех чисел = " + sum);

    }
}




