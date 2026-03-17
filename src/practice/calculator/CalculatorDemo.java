package practice.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.x = 50;
        myCalculator.y =20;
        int resultSubstr = myCalculator.subtraction();

        System.out.println( " Результат вычитания = " + myCalculator.subtraction());


        Calculator myCalculator1 = new Calculator();
        myCalculator1.x = 50;
        myCalculator1.y = 20;
        int resultSum = myCalculator1.sum();

        System.out.println(" Результат сложения = " + resultSum);


        Calculator myCalculator2 = new Calculator();
        myCalculator2.x = 50;
        myCalculator2.y = 20;
        int resultMulti = myCalculator2.multi();

        System.out.println(" Результат умножения = " + resultMulti);


        Calculator myCalculator3 = new Calculator();
        myCalculator3.x = 50;
        myCalculator3.y = 20;
        double resultDiv = myCalculator3.div();

        System.out.println(" Результат деления = " + resultDiv);




        }


    }

