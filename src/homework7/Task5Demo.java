package homework7;

import lesson5.superCalc.UserInput;
import practice.supperCalc.SupperCalc;

public class Task5Demo {
    public static void main(String[] args) {

        UserInput myUserInput = new UserInput();
        SupperCalc mySupperCalc = new SupperCalc();

        int x = myUserInput.inputInteger(" Введите первое число: " );
        int y = myUserInput.inputInteger(" Введите второе число: " );

        System.out.println(" Результат сложения чисел  " + x + " и " + y + " = " + mySupperCalc.sum(x,y ));
        System.out.println(" Результат вычитания чисел  " + x + " и " + y + " = " + mySupperCalc.sub(x,y ));
        System.out.println(" Результат умножения чисел  " + x + " и " + y + " = " + mySupperCalc.multi(x,y ));
        System.out.println(" Результат деления чисел  " + x + " и " + y + " = " + mySupperCalc.div(x,y ));




    }
}
