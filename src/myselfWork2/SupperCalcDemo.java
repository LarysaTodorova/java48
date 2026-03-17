package myselfWork2;

import java.util.Scanner;

public class SupperCalcDemo {
    public static void main(String[] args) {

        UserInput newUserInput = new UserInput();
        SupperCalc newSupperCalc = new SupperCalc();

       String userName1 = newUserInput.inputText(" Введите ваше имя ");
        System.out.println(" Уважаемая " + userName1);

        int x = newUserInput.inputInteger(" Введите первое число ");
        int y = newUserInput.inputInteger(" Введите второе число");

        System.out.println(" Результат сложения " + x +" и "  + y + " ="  + newSupperCalc.sum(x,y));



    }

}
