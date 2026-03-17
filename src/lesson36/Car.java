package lesson36;

public class Car {

    private int countOfDoors;
    private Door[] doors;

    public Car(int countOfDoors,double doorLength,double doorHeight) {
        this.countOfDoors = countOfDoors;
        this.doors = new Door[countOfDoors];

        for (int i = 0; i < countOfDoors; i++) {
            doors[i] = new Door(doorLength,doorHeight);

        }
    }

    public class Door {
        private double length;
        private double height;

        public Door(double length, double height) {
            this.length = length;
            this.height = height;
        }

        public void open() {
            System.out.println("Open the door");
        }

        public void close() {
            System.out.println("Close the door");
        }

    }
}
/*
1. Создать класс Car (параметр - количество дверей)
2. В этом автомобиле создать класс Door
у которого будут характеристики длина и высота
и который бы мог открываться и закрываться
 */