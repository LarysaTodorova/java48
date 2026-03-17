package practice.calculatorWithArguments;

public class CalculatorWithArgumentsDemo {
    public static void main(String[] args) {

        CalculatorWithArguments myCalculatorWithArguments = new CalculatorWithArguments();
        int resultSun = myCalculatorWithArguments.sum(55,25);

        System.out.println(" Результат сложения = " + resultSun);


        CalculatorWithArguments myArgCalc = new CalculatorWithArguments();
        int resultMulti = myArgCalc.multi(15,10);

        System.out.println(" Результат умножения = " + resultMulti);

        CalculatorWithArguments myArgCalc1 = new CalculatorWithArguments();
        int resultSubtr = myArgCalc1.subtraction(60,35);

        System.out.println(" Результат вычитания = " + resultSubtr);


        CalculatorWithArguments myArgCalc2 = new CalculatorWithArguments();
        double resultDiv = myArgCalc2.div(80,20);

        System.out.println(" Результат деления = " + resultDiv);



    }
}
