package code;

public class SaladDemo {
    public static void main(String[] args) {
        Salad deliciosSalad = new Salad();
        deliciosSalad.Vegetable1 = "cucumber";
        deliciosSalad.Vegetable2 = "tomato";
        deliciosSalad.Vegetable3 = "paprika";
        deliciosSalad.quantity = 6;
        deliciosSalad.salt = 0.10;
        deliciosSalad.oliveOil = 0.20;


        deliciosSalad.salad();


    }
}