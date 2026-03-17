package lesson5.superCalc;

public class SuperCalcDemo {
    public static void main(String[] args) {


        UserInput userInput = new UserInput();
        SuperCalc calc = new SuperCalc();

        int x = userInput.inputInteger("Введите первое число: ");
        int y = userInput.inputInteger("Введите второе число: ");

        double summResult = calc.sum(x, y);

        System.out.println("Результат сложения чисел " + x + " и " + y + " = " + summResult);


        System.out.println("Результат вычитания чисел " + x + " и " + y + " = " + calc.sub(x,y));

        System.out.println("Результат умножения чисел " + x + " и " + y + " = " + calc.multi(x, y));

        System.out.println("Результат деления чисел " + x + " и " + y + " = " + calc.div(x, y));

    }
}
