package homework30.task1;

public class Flat implements Comparable<Flat> {
    private Double square;
    private Integer quantityRooms;

    public Flat(Double square, int quantityRooms) {
        this.square = square;
        this.quantityRooms = quantityRooms;
    }

    public Double getSquare() {
        return square;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "square=" + square +
                ", quantityRooms=" + quantityRooms +
                '}';
    }

    @Override
    public int compareTo(Flat flatToCompare) {
        int compareResult = square.compareTo(flatToCompare.getSquare());
        if (compareResult == 0) {
            compareResult = quantityRooms.compareTo(flatToCompare.getQuantityRooms());
        }

        return compareResult;
    }
}
