package homework19.threeInOne;

import lesson19.shapeWithInharitance.Shape;

public class Square extends Shape {


    private double sideA;



    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }
@Override
    public double calculateArea() {
        return sideA * sideA;

    }
@Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideA);

    }
}
