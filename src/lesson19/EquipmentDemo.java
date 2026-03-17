package lesson19;

public class EquipmentDemo {
    public static void main(String[] args) {

        Phone phone = new Phone("Apple", "Iphone 14");
        Tv tv = new Tv("Sumsung", "165");

        System.out.println("Телефон " );

        phone.changeVolume(50);
        phone.turnOnn();
        phone.turnOff();
        System.out.println("================");

        System.out.println();


        tv.changeVolume(30);
        tv.turnOnn();
        tv.turnOff();
    }
}
