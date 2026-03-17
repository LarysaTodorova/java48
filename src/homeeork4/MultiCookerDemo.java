package homeeork4;

public class MultiCookerDemo {
    public static void main(String[] args) {

        MultiCooker Tefal =  new MultiCooker();
        Tefal.producer = "Tefal";
        Tefal.model = "Essential RK 34 A";
        Tefal.programs = 37;
        Tefal.programNow = 8;

        Tefal.on();
        Tefal.changeMore();
        Tefal.changeLess();
        Tefal.off();




    }
}
