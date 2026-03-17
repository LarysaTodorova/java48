package consultation11;

public class Tablet extends Electronic implements MakePhoto{
    public Tablet(String manufacture, String name, double price, int id) {
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
