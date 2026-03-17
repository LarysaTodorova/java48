package lesson43;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("Toyota Camry", 2020, 15000.0, "John Doe");

        System.out.println(car.getCarInfo());  // Выведет информацию об автомобиле

        System.out.println(car.getCarInfo());// Информация о владельце осталась неизменной
    }

}
