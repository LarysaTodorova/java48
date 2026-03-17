package practice12;

import lesson5.superCalc.UserInput;

public class SimpleNumberDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        SimpleNumber simpleNumber = new SimpleNumber();

        int number = userInput.inputInteger("Введите целое число:");
        boolean check = simpleNumber.isSimple(number);

        if (check){
            System.out.println("Число " + number + " является простым");
        }else {
            System.out.println("Число " + number + " НЕ является простым!");
        }
    }

}
