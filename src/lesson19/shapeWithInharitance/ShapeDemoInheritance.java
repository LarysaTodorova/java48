package lesson19.shapeWithInharitance;


public class ShapeDemoInheritance {
    public static void main(String[] args) {


        Circle circle1 = new Circle("Circle1", 15);
        Circle circle2 = new Circle("Circle2", 9);
        Circle circle3 = new Circle("Circle3", 17);


        Square square1 = new Square("Square1", 10);
        Square square2 = new Square("Square2", 15);
        Square square3 = new Square("Square3", 7);

        Rectangle rectangle1 =  new Rectangle("Rectangle1", 11, 5);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 10, 7);
        Rectangle rectangle3 = new Rectangle("Rectangle3", 17, 3);


        Shape[] shapes = {circle1,circle2,circle3,square1,square2,square3,rectangle1,rectangle2,rectangle3};

        double allAreas = 0;

        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculateArea();
        }
        System.out.println("Площадь всех фигур = " + allAreas);
    }
}
