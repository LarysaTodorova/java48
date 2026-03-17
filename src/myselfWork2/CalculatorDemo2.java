package myselfWork2;

public class CalculatorDemo2 {

    public static void main(String[] args) {

        Calculator2 myCalculator = new Calculator2();
        myCalculator.x = 20;
        myCalculator.y = 10;

        int sumResult = myCalculator.sum();
       int divResult = myCalculator.subtraction();

        System.out.println(sumResult);
        System.out.println(divResult);


    }

}
