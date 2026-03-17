package homework19.inheritance.task1;

public class VehicleDemo {
    public static void main(String[] args) {

        Car car = new Car("Audi", 5);
        car.speedUp();
        System.out.println(car.getName());
        System.out.println("number of doors: " + car.getNumberOfDoors());

        System.out.println("============================");

        Bicycle bicycle = new Bicycle("Cube", "cityType");
        bicycle.changeGear();
        System.out.println(bicycle.getName());
        System.out.println(bicycle.getType());
    }

}
