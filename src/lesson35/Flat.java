package lesson35;

public class Flat extends RealEstate{

    private Double flatArea;
    private Integer amountOfRooms;
    private Integer price;

    public Flat(Double flatArea, Integer amountOfRooms, Integer price) {
        this.flatArea = flatArea;
        this.amountOfRooms = amountOfRooms;
        this.price = price;
    }

    public Double getFlatArea() {
        return flatArea;
    }

    public Integer getAmountOfRooms() {
        return amountOfRooms;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatArea=" + flatArea +
                ", amountOfRooms=" + amountOfRooms +
                ", price=" + price +
                '}';
    }
}
