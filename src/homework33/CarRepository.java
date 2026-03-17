package homework33;

import java.util.*;

public class CarRepository {

    private Set<Car> cars;

    public CarRepository(Set<Car> cars) {
        this.cars = new HashSet<>();
    }

    public void printAllCarData(Car car) {
        System.out.println("Vin " + car.getVIN());
        System.out.println("Producer " + car.getProducer());
        System.out.println("Model " + car.getModel());
        System.out.println("Year " + car.getYearOfProduction());
    }

    public void printAllCars(Set<Car> cars) {
        System.out.println(cars);
    }

    public List<Car> carsSortedByYear(Set<Car> cars) {
        List<Car> sortedCars = new ArrayList<>();
        sortedCars.addAll(cars);
        Collections.sort(sortedCars);
        return sortedCars;
    }

}
