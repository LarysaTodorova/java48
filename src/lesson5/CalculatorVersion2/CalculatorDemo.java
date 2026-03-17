package lesson5.CalculatorVersion2;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.x = 5;
        myCalculator.y = 15;

     myCalculator.sum();
     myCalculator.multi();

        System.out.println(" Результат сложения = " + myCalculator.sum );
        System.out.println(" Результат умножения = " + myCalculator.multi);


        int superResult = myCalculator.sum + myCalculator.multi;
        System.out.println(" Супер результат = " + superResult);









    }
}
