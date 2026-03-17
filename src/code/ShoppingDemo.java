package code;

public class ShoppingDemo {
    public static void main(String[] args) {

        Shopping dress = new Shopping();
        dress.name = "dress";
        dress.color = "red";
        dress.producer = "Guссi";
        dress.size = "M";
        dress.price = 450;
        dress.discount = 70.5;

        dress.clothes();


        Shopping shirt = new Shopping();
        shirt.color = " yellow";
        shirt.name = "shirts";
        shirt.size = "M";
        shirt.quantity = 3;
        shirt.price = 48;
        shirt.discount = 34.60;

        shirt.Shirt();


    }
}
