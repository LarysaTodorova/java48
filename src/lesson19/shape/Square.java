package lesson19.shape;

public class Square {

    private String title;
    private double sideA;

    public Square(String title, double sideA) {
        this.title = title;
        this.sideA = sideA;
    }

    public double calculateArea() {
        return sideA * sideA;

    }

    public double calculatePerimeter() {
        return 2 * (sideA + sideA);

    }
}
