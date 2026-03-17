package lesson4;

public class Moto {

    String producer;
    String model;
    int maxSpeed;
    int engine;

    public void honk () {
        System.out.println("Moto " + model + " honks");

    }

    public void engineStart () {
        System.out.println("Moto " + producer+ " " + model + " turned on the engine");
        System.out.println("Engine : " + engine);
        System.out.println("The motorcycle can accelerate to maximum speed " + maxSpeed);

    }

    public void engineStop () {

        System.out.println("Moto " + producer+ " " + model + " Turned off the engine");
    }


}
