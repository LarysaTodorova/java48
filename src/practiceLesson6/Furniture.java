package practiceLesson6;

public class Furniture {

    String type;
    String material;
    String color;

    public Furniture() {}

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public Furniture(String type, String material, String color) {
        this.type = type;
        this.material = material;
        this.color = color;
    }

    public void furnitureInfo() {
        System.out.println(" Информация о мебели: ");
        System.out.println(" Тип мебели: " + type);
        System.out.println(" Материал мебели: "+ material);
        System.out.println(" Цвет мебели: " + color);

    }

}
