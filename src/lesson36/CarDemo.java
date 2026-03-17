package lesson36;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car(4, 2.7, 33.5);

        Car.Door carDoors = myCar.new Door(2.7,35.5);

        carDoors.close();
        carDoors.open();

    }
}
