package lesson19.abstractionCar;

public class TruckCar extends Car{
    public TruckCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("TRUCK");

    }

    @Override
    int speedUp() {
        System.out.println("Truck speed :");
        return 100;
    }
}
