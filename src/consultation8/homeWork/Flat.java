package consultation8.homeWork;

public class Flat {
    private int flatNumber;

    public Flat(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatNumber=" + flatNumber +
                '}';
    }
}
