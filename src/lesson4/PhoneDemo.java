package lesson4;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.model = "IPhone 14 pro";
        myPhone.manufacturer = "Aple";

        myPhone.ring();

        Phone mySecondPhone = new Phone();
        mySecondPhone.model ="Galaxy 15";
        mySecondPhone.manufacturer = "Samsung";

        mySecondPhone.ring();

    }
}
