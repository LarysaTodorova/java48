package homework19.inheritance.task1;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moving() {
        System.out.println("Our vehicle is moving");
    }

}
