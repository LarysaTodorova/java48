package homework34MiniProject;

import java.util.HashMap;
import java.util.Map;

public class CarDemo {
    public static void main(String[] args) {

        CarDealer carDealer = new CarDealer();


        Car car1 = new Car("11111", "Audi", "A-6", 45000.0, 2023, 10);
        Car car2 = new Car("22222", "BMW", "M-5", 55000.0, 2019, 9);
        Car car3 = new Car("33333", "VW", "Polo", 4550.0, 2009, 5);
        Car car4 = new Car("44444", "Mazda", "CX7", 22000.0, 2015, 6);
        Car car5 = new Car("55555", "Honda", "CRV", 15000.0, 2015, 7);
        Car car6 = new Car("66666", "Audi", "R-8", 65000.0, 2024, 10);

        carDealer.addCar("11111",car1);
        carDealer.addCar("22222",car2);
        carDealer.addCar("33333",car3);
        carDealer.addCar("44444",car4);
        carDealer.addCar("55555",car5);
        carDealer.addCar("666666",car6);

        carDealer.print();
        System.out.println("================");


        System.out.println(carDealer.sortedCar());
        System.out.println("==============");
        carDealer.remove("33333");
        carDealer.print();
        System.out.println("==============");
        System.out.println("Change price: " + carDealer.changePrice("22222", 50000.0));
        System.out.println("=============");

        System.out.println("Founded cars by producer1:" + carDealer.findByProducer("Audi"));
        System.out.println("================");
        System.out.println("Founded cars by year: " + carDealer.foundedCarsByYear(2015));
        System.out.println("=============");

        System.out.println("Change rating: " + carDealer.changeRating("44444", 8.0));
        carDealer.printSomeCars("Audi");
        carDealer.printCarsByYears(2015);

    }
}
