package homework33;

import java.util.HashSet;
import java.util.Set;

public class CarParkApp {
    public static void main(String[] args) {

        Set<Car> cars = new HashSet<>();

        Car car1 = new Car("45456hjk", "BMW", "X5", 2015);
        Car car2 = new Car("5656hjk", "VW", "46", 2020);
        Car car3 = new Car("11456hjk", "Audi", "A6", 2024);
        Car car4 = new Car("077456hjk", "Mazda", "C7", 2012);
        Car car5 = new Car("76456hjk", "Lamborghini", "Ursus", 1999);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        CarRepository repository = new CarRepository(cars);


        Set<Client> clients = new HashSet<>();

        Client client1 = new Client(1, "Alexa B", "Address 1, City 1, telephone number 12222");
        Client client2 = new Client(2, "Oliver C", "Address 2, City 1, telephone number 345456");
        Client client3 = new Client(3, "Eva N", "Address 3, City 2, telephone number 066393");
        Client client4 = new Client(4, "Andrew I", "Address 4, City 3, telephone number 003357");
        Client client5 = new Client(5, "Frank W", "Address 5, City 3, telephone number 663845");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);

        ClientRepository clientRepository = new ClientRepository(clients);

        Set<Rent> rents = new HashSet<>();

        Rent rent1 = new Rent(1, 200, client1, car1, "01/09/2024", 10, "активный");
        Rent rent2 = new Rent(2, 100, client1, car2, "01/08/2023", 5, "завершенный");
        Rent rent3 = new Rent(3, 300, client2, car3, "01/09/2024", 7, "просроченный");
        Rent rent4 = new Rent(4, 250, client3, car4, "11/09/2024", 11, "активный");
        Rent rent5 = new Rent(5, 100, client4, car5, "01/06/2020", 4, "завершенный");
        Rent rent6 = new Rent(7, 150, client1, car5, "03/08/204", 5, "завершенный");

        rents.add(rent1);
        rents.add(rent2);
        rents.add(rent3);
        rents.add(rent4);
        rents.add(rent5);

        RentRepository rentRepository = new RentRepository(rents);

        repository.printAllCars(cars);
        System.out.println(repository.carsSortedByYear(cars));
        repository.printAllCarData(car1);
        System.out.println("===============================");

        clientRepository.printAllClientData(1);
        System.out.println("===============================");


        System.out.println(rentRepository.carsInRent(rents));
        System.out.println(rentRepository.clientCarInRent(client1));
        System.out.println(rentRepository.findByNumberOfContract(1));
        rentRepository.getStartAndTermOfRentCar(car2);
        System.out.println("История аренды: " + rentRepository.clientRentHistory(client1));
        System.out.println("Статус авто: " + rentRepository.carRentStatus(car1));


    }
}

