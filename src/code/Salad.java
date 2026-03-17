package code;

public class Salad {

    String Vegetable1;
    String Vegetable2;
    String Vegetable3;
    int quantity;
    double salt;
    double oliveOil;



    public void salad () {
        System.out.println( " To prepare a salad we need: ");
        System.out.println( " " + Vegetable1 +  ( quantity  - 3 ) + " " + Vegetable2  + ( quantity -2 ) + " " +  Vegetable3 + ( quantity -4 ));
        System.out.println( " Add a little salt " + salt  + " and  olive oil " +  oliveOil );
        System.out.println( " Stir the salad");
        System.out.println( " Bon appetit !");


    }
}
