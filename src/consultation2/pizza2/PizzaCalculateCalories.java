package consultation2.pizza2;

public class PizzaCalculateCalories {
    public static void main(String[] args) {

        Pizza2 pizza1 = new Pizza2();
        pizza1.pizzaName = "4 сыра";
        pizza1.diametr = 24;
        pizza1.caloriesInOneCm = 40;

        Pizza2 pizza3 = new Pizza2();
        pizza3.pizzaName = "Margarita";
        pizza3.diametr = 28;
        pizza3.caloriesInOneCm = 40;

        pizza1.totalCaloriesPizza();
        pizza3.totalCaloriesPizza();


        double extraCalories = pizza3.totalCalories - pizza1.totalCalories;

        System.out.println(" Количество лишних каллорий = " + extraCalories);




    }
}
