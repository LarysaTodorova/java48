package consultation11;

public class DigitalCamera extends Electronic implements MakePhoto{
    public DigitalCamera(String manufacture, String name, double price, int id) {
        super(manufacture, name, price, id);
    }

    @Override
    void turnOn() {

    }

    @Override
    void turnOff() {

    }

    @Override
    public void makePhoto() {

    }
}
