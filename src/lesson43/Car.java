package lesson43;

final class Car {
    private final String model;         // Модель автомобиля
    private final int year;             // Год выпуска
    private double mileage;       // Пробег
    private String owner;         // Владелец автомобиля

    Car(String model, int year, double mileage, String owner) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.owner = owner;
    }

    void drive(final double distance) {
        mileage = mileage + distance;

    }

    void changeOwner(final String newOwner) {
        owner = newOwner;

    }

    String getCarInfo() {
        return "Model: " + model + ", Year: " + year + ", Mileage: " + mileage + ", Owner: " + owner;
    }
}





