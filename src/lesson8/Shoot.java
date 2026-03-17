package lesson8;

public class Shoot {

    private String vert;
    private int horiz;

    public Shoot(String vert, int horiz) {
        this.vert = vert;
        this.horiz = horiz;
    }

    public String getVert() {
        return vert;
    }

    public int getHoriz() {
        return horiz;
    }

    @Override
    public String toString() {
        return "Shoot{" +
                "vert='" + vert + '\'' +
                ", horiz=" + horiz +
                '}';
    }
}
