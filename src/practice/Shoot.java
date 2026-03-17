package practice;

public class Shoot {

    private String vert;
    private int hor;

    public Shoot(String vert, int hor) {
        this.vert = vert;
        this.hor = hor;
    }

    public String getVert() {
        return vert;
    }

    public int getHor() {
        return hor;
    }

    @Override
    public String toString() {
        return "Shoot{" +
                "vert='" + vert + '\'' +
                ", hor=" + hor +
                '}';
    }
}
