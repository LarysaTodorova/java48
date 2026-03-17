package homework19.threeInOne;

public class Triangle extends Shape{

    private double sideA;
    private double sideH;

    public Triangle(String title, double sideA, double sideH) {
        super(title);
        this.sideA = sideA;
        this.sideH = sideH;
    }

    @Override
    double calculateArea() {
        return (sideA * sideH) / 2;
    }

    @Override
    double calculatePerimeter() {
        return sideA * sideA * sideA;
    }
}
