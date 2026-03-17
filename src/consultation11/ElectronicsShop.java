package consultation11;

public class ElectronicsShop {
    public static void main(String[] args) {

        DigitalCamera digitalCamera = new DigitalCamera("Philps", "camera",1250, 123);
        FoodProcessor foodProcessor = new FoodProcessor("Zelmer", "A125", 350, 555);
        Leptop leptop = new Leptop("HP", "T22", 1500, 333);
        Phone phone = new Phone("Apple", "iPhone", 1500, 666);
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner("Xeaome", "S5", 500, 999);
        Tablet tablet = new Tablet("Apple", "Ipad", 1000, 444);
        TV tv = new TV("Sony", "DDD", 1500, 777);

        Electronic[] electronics = {digitalCamera,foodProcessor,leptop,phone,robotVacuumCleaner,tablet,tv};

        MakePhoto[] makePhotos = {digitalCamera,tablet,phone};

        Timer[] timers = {robotVacuumCleaner, foodProcessor};

        for (int i = 0; i < makePhotos.length; i++) {
            makePhotos[i].makePhoto();
        }
            for (int i = 0; i < timers.length; i++) {
                timers[i].startTime();
            }
        }
    }


