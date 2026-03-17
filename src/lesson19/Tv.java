package lesson19;

public class Tv extends Equipment{
    private String model;

    public Tv(String producer, String model) {
        super(producer);
        this.model = model;
    }

    @Override
    void turnOnn() {
        System.out.println("Телевизор включен");

    }

    @Override
    void turnOff() {
        System.out.println("Телевизор выключен");
    }

    @Override
    public void changeVolume(int volume) {

    }
}
