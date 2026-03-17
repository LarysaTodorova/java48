package lesson19.shape;

public class ShapeDemoArrayOldSchool{
    public static void main(String[] args) {
        
    

    Circle circle1 = new Circle("Circle1", 15);
    Circle circle2 = new Circle("Circle2", 9);
    Circle circle3 = new Circle("Circle3", 17);
    Circle[] circles = {circle1, circle2, circle3};

    Square square1 = new Square("Square1", 10);
    Square square2 = new Square("Square2", 15);
    Square square3 = new Square("Square3", 7);
    Square[] squares = {square1, square2, square3};

    Rectangle rectangle1 = new Rectangle("Rectangle1", 11, 5);
    Rectangle rectangle2 = new Rectangle("Rectangle2", 10, 7);
    Rectangle rectangle3 = new Rectangle("Rectangle3", 17, 3);
    Rectangle[] rectangles = {rectangle1,rectangle2, rectangle3};


    // -------- считаем площади всех элементов -----//

    double allArea = 0;

        for (int i = 0; i < circles.length; i++) {
            allArea = allArea + circles[i].calculateArea();
        }

        for (int i = 0; i < squares.length; i++) {
            allArea = allArea + squares[i].calculateArea();
        }

        for (int i = 0; i < rectangles.length; i++) {
            allArea = allArea + rectangles[i].calculateArea();
        }

        System.out.println("Площадь всех фигур = " + allArea);
    }
}