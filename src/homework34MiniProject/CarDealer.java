package homework34MiniProject;

import java.util.*;

public class CarDealer {

    private Map<String, Car> cars;

    public CarDealer() {
        this.cars = new HashMap<>();
    }

    public void addCar(String vin ,Car car) {
        cars.put(vin, car);

    }

    public List<Car> sortedCar() {
        List<Car> carsForSort = new ArrayList<>(cars.values());
        Collections.sort(carsForSort);
        return carsForSort;

    }

    public void remove(String vin) {
        cars.remove(vin);
    }

    public void print() {
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }

    public Car changePrice(String vin, Double newPrice) {
        Car currentCar = cars.get(vin);
        if (currentCar != null) {
            currentCar.setPrice(newPrice);
        }
        return currentCar;
    }

    public Car changeRating(String vin, Double rating) {
        Car car = cars.get(vin);
        if (car != null) {
            car.setRating(rating);
        }
        return car;
    }

    public List<Car> findByProducer(String producer) {
        List<Car> modelCars = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getProducer().equalsIgnoreCase(producer)) {
                modelCars.add(car);
            }
        }
        return modelCars;
    }

    public List<Car> foundedCarsByYear(Integer year) {
        List<Car> foundedCars = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getYearOfProduction() == year) {
                foundedCars.add(car);
            }
        }
        return foundedCars;
    }

    public void printSomeCars(String producer) {
        List<Car> printCars = findByProducer(producer);
        for (Car car : printCars) {
            System.out.println(car);
        }
    }

    public void printCarsByYears(Integer year) {
        List<Car> printCars = foundedCarsByYear(year);
        for (Car car : printCars) {
            System.out.println(car);
        }
    }
}
/*
 В классе CarDealer реализовать методы для добавления новых автомобилей, удаления автомобилей из списка,
    обновления информации о конкретной машине (например, цены или рейтинга), а также поиска автомобилей
    по различным критериям (марка, модель, год выпуска).
    Добавить функционал для оценки автомобилей покупателями и сортировки автомобилей по рейтингу, цене или году выпуска.
    Реализовать возможность вывода информации о всех автомобилях в наличии или автомобилях определенной марки.

 */