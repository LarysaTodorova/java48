package consultation2;

public class Pizza {
    public static void main(String[] args) {
         int diametr1 = 24;
         int diametr2 = 28;
         int calories = 40;

         double areaPizza1 = 3.1415 * ( diametr1 * diametr1) /4.0;
         double areaPizza2 = 3.1415 * ( diametr2 * diametr2) /4.0;
         double caloriesPizza1 = areaPizza1 * calories;
         double caloriesPizza2 = areaPizza2 * calories;
         double extraCalories = caloriesPizza2 - caloriesPizza1;

        System.out.println(" количество лишних каллорий = " + extraCalories);


        System.out.println( " === второ йавриант расчета для пиццы 25 и 27 см ");

         diametr1 = 25;
         diametr2 = 27;
         calories = 40;

         areaPizza1 = 3.1415 * ( diametr1 * diametr1) /4.0;
         areaPizza2 = 3.1415 * ( diametr2 * diametr2) /4.0;
         caloriesPizza1 = areaPizza1 * calories;
         caloriesPizza2 = areaPizza2 * calories;
         extraCalories = caloriesPizza2 - caloriesPizza1;

        System.out.println(" количество лишних каллорий = " + extraCalories);







    }
}
