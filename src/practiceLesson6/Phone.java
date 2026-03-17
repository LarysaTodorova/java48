package practiceLesson6;

public class Phone {

    String model;
    String producer;
    double price;

    public Phone(String model, String producer, double price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public void printPhoneData() {
        System.out.println(" Информация о товаре: ");
        System.out.println(" Модель: " + model);
        System.out.println(" Производитель: " + producer);
        System.out.println(" Цена " + price);
    }
}

