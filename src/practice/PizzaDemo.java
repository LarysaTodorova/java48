package practice;

public class PizzaDemo {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza(28,40);
        double result = pizza1.caloriesInOneSM();
        System.out.println(result);

        Pizza pizza2 = new Pizza(24,40);
        double result2 = pizza2.caloriesInOneSM();
        System.out.println(result2);

        System.out.println(result-result2);
    }

}
