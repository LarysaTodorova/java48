package homework33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RentRepository {
    Set<Rent> rents = new HashSet<>();

    public RentRepository(Set<Rent> rents) {
        this.rents = rents;
    }

    public List<Car> carsInRent(Set<Rent> allRents) {
        List<Car> carsInRent = new ArrayList<>();
        for (Rent rent : allRents) {
            if (!rent.getStatus().equalsIgnoreCase("завершенный")) {
                carsInRent.add(rent.getCar());
            }
        }
        return carsInRent;
    }

    public boolean clientCarInRent(Client client) {
        for (Rent rent : rents) {
            if (rent.getClient() == client) {
                System.out.println("У данного клиента есть машина в аренде.");
                return true;
            }
        }
        return false;
    }

    public Rent findByNumberOfContract(int numberOfContract) {
        for (Rent rent : rents) {
            if (rent.getNumberOfContract() == numberOfContract) {
                return rent;
            }
        }
        return null;
    }

    public void getStartAndTermOfRentCar(Car car) {
        for (Rent rent : rents) {
            if (rent.getCar() == car) {
                System.out.println("Машина выдана: " + rent.getStartDateOfRent());
                System.out.println("Машина выдана на: " + rent.getAmountOfRentingDays() + " дней");
            }
        }
    }

    public Client clientRentHistory(Client client) {
        List<Rent> clientRents = new ArrayList<>();
        for (Rent rent : rents) {
            if (rent.getClient().equals(client)) {
                clientRents.add(rent);
            }
        }
        client.setClientRents(clientRents);
        return client;
    }

    public String carRentStatus(Car car) {
        for (Rent rent : rents) {
            if (rent.getCar().equals(car)) {
                return rent.getStatus();
            }
        }
        return null;
    }

}
