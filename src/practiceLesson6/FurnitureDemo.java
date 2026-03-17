package practiceLesson6;

public class FurnitureDemo {

    public static void main(String[] args) {

        Furniture furniture1 = new Furniture();

        furniture1.furnitureInfo();
        furniture1.type = "table";
        furniture1.material = "wood";
        furniture1.color = "black";

        Furniture furniture2 = new Furniture(" sofa", "lese");
        furniture2.furnitureInfo();

        Furniture furniture3 = new Furniture("chair", "plastic", "grey");
        furniture3.furnitureInfo();



    }
}
