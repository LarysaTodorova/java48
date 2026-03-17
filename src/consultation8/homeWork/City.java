package consultation8.homeWork;

import java.util.Arrays;

public class City {

    private String cityName;
    private  Street streets;

    public City(String cityName, Street streets) {
        this.cityName = cityName;
        this.streets = streets;
    }

    public String getCityName() {
        return cityName;
    }

    public Street getStreets() {
        return streets;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", streets=" + streets +
                '}';
    }
}
