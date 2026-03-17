package practice;

public class Pizza {

    double diametr;
    double calories;

    public Pizza(double diametr, double calories) {
        this.diametr = diametr;
        this.calories = calories;
    }

    public double caloriesInOneSM(){
        double caloriesInPizza = calories * Math.PI*(diametr * diametr)/4;
        return caloriesInPizza;

    }

}
