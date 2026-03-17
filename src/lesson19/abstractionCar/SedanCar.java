package lesson19.abstractionCar;

public class SedanCar extends Car {
    public SedanCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("sedan beep");

    }

   @Override
    int speedUp() {
        System.out.println("our sedan speeds till 120 ");
        return 120;
    }
}
