package consultation_21_07_2025;

public enum Coffee {
    SMALL(2), REGULAR(3), LARGE(5);
    private final int price;

    Coffee(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
