package lesson5.CalculatorVersion3;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.x = 10;
        calculator.y = 5;

        int result = calculator.sum();
        int resultMulti = calculator.multi();

        System.out.println(" Результат сложения = " + result);
        System.out.println(" Результат умножения = " + resultMulti);

        int superResult = result + resultMulti;
        System.out.println(" Суперрезультат = " + superResult);











    }
}
