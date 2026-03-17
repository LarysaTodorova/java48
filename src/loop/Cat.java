package loop;

public class Cat {
    private String catName;
    private String catBred;

    public Cat(String catName, String catBred) {
        this.catName = catName;
        this.catBred = catBred;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catBred='" + catBred + '\'' +
                '}';
    }
}
