package lesson7;

public class PhoneDemo {

    public static void main(String[] args) {

        Phone myPhone = new Phone("Apple",  "iPhone 14",  "Gold", 1500);

        System.out.println(" Producer: " + myPhone.getProducer());
        System.out.println(" Model : " + myPhone.getModel());
        System.out.println(" Color: " + myPhone.getColor());
        System.out.println("Price: " + myPhone.getPrice());

        myPhone.setPrice(1250);
        System.out.println("Price: "+ myPhone.getPrice());



    }
}
