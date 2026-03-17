package lesson14;

public class Bicycle {
    private int id;
    private String model;
    private String type;
    private int price;

    public Bicycle(int id, String model, String type, int price) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

