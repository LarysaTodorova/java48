package lesson19.abstraction.animal;

public class Fish extends Animal {

    private boolean eatable;

    public Fish(boolean eatable) {
        this.eatable = eatable;
    }

    public boolean isEatable() {
        return eatable;
    }

    @Override
    void breath() {
        System.out.println("Gils");

    }
}
