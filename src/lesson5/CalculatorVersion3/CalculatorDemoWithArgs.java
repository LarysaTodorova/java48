package lesson5.CalculatorVersion3;

public class CalculatorDemoWithArgs {
    public static void main(String[] args) {

        CalculatorWithArguments calculatorWithArguments = new CalculatorWithArguments();

        int resultSum = calculatorWithArguments.sum(55, 17);

        System.out.println(" Результат сложения = " + resultSum);

    }
}
