package consultation6;

import lesson5.superCalc.UserInput;

public class NumberDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Number number = new Number();

        double thisNumber = userInput.inputDouble("Введите целое число");

        System.out.println("Количество четных чисел: " + number.numberEven(thisNumber));
        System.out.println("Количество нечетных чисел: " + number.numberOdd(thisNumber));


    }
}
