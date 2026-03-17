package homework19.threeInOne;

import java.util.Random;

public class ShapeDemo {
    public static void main(String[] args) {

/*
Создать сервисный класс, в котором написать метод для создания массива фигуры произвольного размера.
В нем же напишите метод для заполнения этого массива случайными фигурами с произвольными (случайными) параметрами.
Посчитайте и выведите информацию о каждой фигуре, ее площади и периметрах.
 И посчитать площадь и периметр для всех фигур.
 Все случайные значения должны быть «случайными» в пределах заданных диапазонов.
 Например, размер массива от 10 до 20 элементов и т.д.
 */

        Circle circle1 = new Circle("Circle", 10);
        Circle circle2 = new Circle("Circle", 11);
        Circle circle3 = new Circle("Circle", 12);

        Rectangle rectangle1 = new Rectangle("Rectangle", 5,7);
        Rectangle rectangle2 = new Rectangle("Rectangle", 7,9);
        Rectangle rectangle3 = new Rectangle("Rectangle", 8,7);

        Square square1 = new Square("Square", 9);
        Square square2 = new Square("Square", 10);
        Square square3 = new Square("Square", 8);


        Triangle triangle1 = new Triangle("Triangle", 6,7);
        Triangle triangle2 = new Triangle("Triangle", 5,7);
        Triangle triangle3 = new Triangle("Triangle", 8,10);

        Shape[] shapes = {circle1,circle2,circle3,rectangle1,rectangle2,rectangle3,triangle1,triangle2,triangle3};

        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());


       // ShapeService service = new ShapeService();
       // System.out.println(service.fillArray (shapes));


        double allAreas = 0;

        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculateArea();
        }
        System.out.println("Area of oll shapes: " + allAreas);

        double allPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            allPerimeter = allPerimeter + shapes[i].calculatePerimeter();

        }
        System.out.println("Perimeter of all shapes: " + allPerimeter);
    }


}
