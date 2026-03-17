package homework14;

public class Bicycle {
    /*
    1) Сохдать массив из 15 элементов и заполнить их
2) посчитать количество велосипедов городского типа с ценой ниже 500
3*) создать отдельный массив куда сохранить эти велосипеды
     */
    private int id;
    private  String model;
    private String type;
    private double price;

    public Bicycle(int id, String model, String type, double price) {
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

    public double getPrice() {
        return price;
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
