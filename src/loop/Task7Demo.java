package loop;

import lesson5.superCalc.UserInput;

public class Task7Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        Task7 task7 = new Task7();
        int counter = task7.numberOfIteration(3);
        System.out.println("Введите количесьво итерраций " + counter);
        int max = 0;
        int number = userInput.inputInteger("Введите целое число");
        while (number > max){
            max = number;
        }

    }
}
