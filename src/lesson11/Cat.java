package lesson11;

public class Cat {
    String catName;
    String catBreed;

    public Cat(String catName, String catBreed) {
        this.catName = catName;
        this.catBreed = catBreed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                '}';
    }
}
