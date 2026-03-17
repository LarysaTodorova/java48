package homework33;

import java.util.Objects;

public class Rent {

    private int numberOfContract;
    private int price;
    private Client client;
    private Car car;
    private String startDateOfRent;
    private int amountOfRentingDays;
    private String status;

    public Rent(int numberOfContract, int price, Client client, Car car, String startDateOfRent, int amountOfRentingDays, String status) {
        this.numberOfContract = numberOfContract;
        this.price = price;
        this.client = client;
        this.car = car;
        this.startDateOfRent = startDateOfRent;
        this.amountOfRentingDays = amountOfRentingDays;
        this.status = status;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public int getPrice() {
        return price;
    }

    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public String getStartDateOfRent() {
        return startDateOfRent;
    }

    public int getAmountOfRentingDays() {
        return amountOfRentingDays;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return numberOfContract == rent.numberOfContract;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfContract);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "numberOfContract=" + numberOfContract +
                ", price=" + price +
                // ", client=" + client +
                ", car=" + car +
                ", startDateOfRent='" + startDateOfRent + '\'' +
                ", amountOfRentingDays=" + amountOfRentingDays +
                ", status='" + status + '\'' +
                '}';
    }
}
