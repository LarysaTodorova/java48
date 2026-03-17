package lesson6.person;

public class Phone {
    String producer;
    String model;
    double price;

    public Phone(String producer, String model, double price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }
    public void printPhoneData() {
        System.out.println(" Характеристики моего телефона: " );
        System.out.println(" Producer: " + producer);
        System.out.println(" Model: " + model);
        System.out.println(" Price: " + price);

    }
}
