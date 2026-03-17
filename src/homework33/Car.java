package homework33;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String VIN;
    private String producer;
    private String model;
    private Integer yearOfProduction;


    public Car(String VIN, String producer, String model, int yearOfProduction) {
        this.VIN = VIN;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;

    }


    public String getVIN() {
        return VIN;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(VIN, car.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(VIN);
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public int compareTo(Car carToCompare) {
        return yearOfProduction.compareTo(carToCompare.getYearOfProduction());
    }
}


