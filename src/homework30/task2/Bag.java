package homework30.task2;

public class Bag implements Comparable<Bag> {
    private String fabric;
    private String size;
    private String color;

    public Bag(String fabric, String size, String color) {
        this.fabric = fabric;
        this.size = size;
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "fabric='" + fabric + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Bag bagToCompare) {
        int compareresalt = size.compareTo(bagToCompare.getSize());
        if (compareresalt == 0) {
            compareresalt = fabric.compareTo(bagToCompare.getFabric());
            if (compareresalt == 0) {
                compareresalt = color.compareTo(bagToCompare.getColor());
            }
        }
        return compareresalt;
    }
}
