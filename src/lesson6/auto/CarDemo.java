package lesson6.auto;

public class CarDemo {
    public static void main(String[] args) {

        Car myFirstCar = new Car();

        myFirstCar.printCarData();

        myFirstCar.producer = "Mercedes";
        myFirstCar.model = "GLC 250";
        myFirstCar.maxSpeed = 230;

        myFirstCar.printCarData();


        Car mySecondCar = new Car();

        mySecondCar.producer = "BMW";
        mySecondCar.model = "M 525";
        mySecondCar.maxSpeed = 260;

        mySecondCar.printCarData();


    }
}
