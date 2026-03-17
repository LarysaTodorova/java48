package homework19.inheritance.task1;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String name, int numberOfDoors) {
        super(name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void speedUp() {
        System.out.println("Car accelerates");
    }
}
