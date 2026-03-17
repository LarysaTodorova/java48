package HomeWork11;

import lesson5.superCalc.UserInput;

public class SimpleNumberDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        SimpleNumber simpleNumber = new SimpleNumber();

        int number = userInput.inputInteger("Введите целое число:");
        boolean checkNumberResult = simpleNumber.isSimple(number);

        if (checkNumberResult){
            System.out.println("Число " + number + " является простым.");
        }else {
            System.out.println("Число " + number + " не является простым.");
        }

    }

}
