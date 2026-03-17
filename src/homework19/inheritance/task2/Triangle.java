package homework19.inheritance.task2;

public class Triangle extends Shape{

    private double sideA;
    private double h ;

    public Triangle(String title, double sideA, double h) {
        super(title);
        this.sideA = sideA;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return sideA * h / 2;
    }
}
