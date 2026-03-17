package homework19.inheritance.task2;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("circle", 10);
        Rectangle rectangle = new Rectangle("rectangle", 5,7);
        Triangle triangle = new Triangle("triangle", 5, 3);

        Shape[] shapes = {circle,rectangle,triangle};

        double allArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            allArea = allArea + shapes[i].calculateArea();

            System.out.println("The area of all elements: " + allArea);

        }
    }
}
