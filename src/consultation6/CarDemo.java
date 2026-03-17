package consultation6;

public class CarDemo {
    public static void main(String[] args) {

        CarModel carModel = new CarModel("A6");
        CarEngine carEngine = new CarEngine("3.0 turbo");
        CarProducer carProducer = new CarProducer("Audi", carModel, carEngine);

        System.out.println(carProducer);

    }

}
