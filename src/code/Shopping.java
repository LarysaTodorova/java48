package code;

public class Shopping {
    String producer;
    String size;
    String color;
    int quantity;
    double price;
    double discount;
    String name;


    public void clothes () {
        System.out.println(" I bought " + color + " " + name + " size " + size + " that costs " + price + " but i got a discount " + discount);
        System.out.println(" With a discount the price turned out - " + (price - discount));

    }

    public void Shirt () {
        System.out.println(" I bought " + quantity + " " + color + " " + name + " size " + size + " that costs " + ( price * 3 ) + " but i got a discount " + discount);
        System.out.println(" With a discount the price turned out - " + (price * 3 - discount));

    }




}
