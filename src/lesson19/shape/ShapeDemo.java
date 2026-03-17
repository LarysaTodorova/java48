package lesson19.shape;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 10);
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Периметр круга = " + circle.calculatePerimeter());


        Square square = new Square("Square", 10);
        System.out.println("Площадь квадрата = " + square.calculateArea());
        System.out.println("Периметр квадрата = " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);
        System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника = " + rectangle.calculatePerimeter());




    }
}
