package lesson19.abstractionCar;

 abstract class Car {

    private String model;


    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    private void printModel() {
        System.out.println("ModelName : " + model);
    }

    abstract void beep();

    abstract int speedUp();

}
