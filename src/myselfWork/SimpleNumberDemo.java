package myselfWork;

import lesson5.superCalc.UserInput;

public class SimpleNumberDemo {
    public static void main(String[] args) {
        SimpleNumber simpleNumber = new SimpleNumber();
        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите целое число");
        boolean result = simpleNumber.isSimple(number);

if (result) {
    System.out.println("Число " + number + " является простым");
}else {
    System.out.println("Число " + number + " НЕ является простым");
}

}}
