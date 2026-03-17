package lesson6;

public class Furniture {
    String type;
    double price;

    public Furniture(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void furniture(){
        System.out.println(" Я купила " + type);
        System.out.println(" По цене " + price);

    }
}
