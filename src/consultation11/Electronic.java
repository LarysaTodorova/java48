package consultation11;

public abstract class Electronic {

    private String manufacture;
    private String name;
    private double price;
    private int id;

    public Electronic(String manufacture, String name, double price, int id) {
        this.manufacture = manufacture;
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    abstract void turnOn();
    abstract void turnOff();

}
