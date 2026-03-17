package consultation8.homeWork;

import java.util.Arrays;

public class House{

    private int houseNumber;
    private Flat[] flat;

    public House(int houseNumber, Flat[] flat) {
        this.houseNumber = houseNumber;
        this.flat = flat;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Flat[] getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", flat=" + Arrays.toString(flat) +
                '}';
    }
}
