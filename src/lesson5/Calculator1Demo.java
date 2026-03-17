package lesson5;

public class Calculator1Demo {
    public static void main(String[] args) {
        Calculator1 myCalculator = new Calculator1();
        myCalculator.x = 15;
        myCalculator.y = 10;

        int resultSub = myCalculator.sub();
        System.out.println(" Результат вычитания = " + resultSub);


    }
}
