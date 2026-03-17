package consultation2.pizza2;

public class Pizza2 {

    String pizzaName;
    int diametr;
    int caloriesInOneCm;
    double totalCalories;

    public void totalCaloriesPizza (){
        totalCalories = caloriesInOneCm * 3.1415 * ( diametr * diametr ) / 4;

    }

}
