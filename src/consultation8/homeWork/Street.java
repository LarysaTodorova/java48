package consultation8.homeWork;

import java.util.Arrays;

public class Street {

    private String streetName;
    private House[] house;

    public Street(String streetName, House[] house) {
        this.streetName = streetName;
        this.house = house;
    }

    public String getStreetName() {
        return streetName;
    }

    public House[] getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetName='" + streetName + '\'' +
                ", house=" + Arrays.toString(house) +
                '}';
    }
}
