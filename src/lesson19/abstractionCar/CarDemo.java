package lesson19.abstractionCar;

public class CarDemo {
    public static void main(String[] args) {

        SedanCar sedan1 = new SedanCar("Audi");
        SedanCar sedan2 = new SedanCar("VW");
        SedanCar sedan3 = new SedanCar("BMV");

        SportCar sport1 = new SportCar("Mazeratti");
        SportCar sport2 = new SportCar("Lumborghini");
        SportCar sport3 = new SportCar("CLP");

        TruckCar truck1 = new TruckCar("Volvo");
        TruckCar truck2 = new TruckCar("Man");
        TruckCar truck3 = new TruckCar("Scun");

        Car[] cars = {sedan1,sedan2,sedan3,sport1,sport2,sport3,truck1,truck2,truck3};

        for (int i = 0; i < cars.length; i++) {
            System.out.println( cars[i].getModel());
            cars[i].beep();
            cars[i].speedUp();


        }



    }
}
