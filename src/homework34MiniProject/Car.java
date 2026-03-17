package homework34MiniProject;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String vinCode;
    private String producer;
    private String model;
    private double price;
    private  int yearOfProduction;
    private Double rating;

    public Car(String vinCode, String producer, String model, double price, int yearOfProduction, double rating) {
        this.vinCode = vinCode;
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.rating = rating;
    }

    public String getVinCode() {
        return vinCode;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getRating() {
        return rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vinCode, car.vinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(vinCode);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinCode='" + vinCode + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", rating=" + rating +
                '}';
    }


    @Override
    public int compareTo(Car carToCompare) {
        return rating.compareTo(carToCompare.getRating());
    }
}
