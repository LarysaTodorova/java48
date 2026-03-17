package consultation6;

public class CarModel {
    /*
    Написать приложение для хранения данных об автомобилях

Объект "Car" должен иметь следующие характеристики:
- модель
- производитель
- тип двигателя
     */
    private String model;

    public CarModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                '}';
    }
}
