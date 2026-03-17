package homework19.inheritance.task1;

public class Bicycle extends Vehicle {

    private String type;

    public Bicycle(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void changeGear() {
        System.out.println("Our bicycle changes gear");
    }
}
