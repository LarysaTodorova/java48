package lesson4;

public class MotoDemo {
    public static void main(String[] args) {

        Moto BMW = new Moto();
        BMW.producer = "BMW";
        BMW.model = "K 1200";
        BMW.engine = 1600;
        BMW.maxSpeed = 280;

        Moto Harley = new Moto();
        Harley.producer ="Harley Davidson";
        Harley.model = "DM 250 BT";
        Harley.engine = 1500;
        Harley.maxSpeed = 240;

        BMW.honk();
        Harley.honk();
        BMW.engineStart();
        Harley.engineStart();

        System.out.println("Returned from a trip");

        BMW.engineStop();
        Harley.engineStop();


    }


}
