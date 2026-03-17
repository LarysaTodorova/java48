package homeeork4;

public class MultiCooker {
    String producer;
    String model;
    int programs;
    int programNow;

    public void on () {
        System.out.println("MultiCooking: " + producer +  " " + model + " Turned on");

    }
    public void  off () {
        System.out.println("MultiCooking: " + producer + " " + model + " Turned off");

    }
    public void changeMore () {
        System.out.println("MultiCooking: " + producer+ " Changed the program on "  + (programNow + 3));
    }


    public void changeLess () {
        System.out.println("MultiCooker: " + producer + " Changed the program on " + (programNow - 5));
    }

}
