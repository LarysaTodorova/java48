package lesson5.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.x = 5;
        myCalculator.y = 10;

        myCalculator.sum();
        myCalculator.multi();

        Calculator calculator = new Calculator();
        calculator.x = 50;
        calculator.y = 2;

        calculator.sum();
        calculator.multi();


        int result = calculator.x + calculator.y;

        System.out.println(" Результат сложения = " + result);

    }
}
