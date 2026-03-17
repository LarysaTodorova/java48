package loop;

import lesson5.superCalc.UserInput;

public class Task2Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Task2 task2 = new Task2();

        int number = userInput.inputInteger("Введите целое число");

        boolean checkNumber = task2.simple(number);

        if (checkNumber){
            System.out.println("число "  + number + " является простым" ) ;
        }else {
            System.out.println("число "  + number + " не является простым" ) ;
        }

    }

}
