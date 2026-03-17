package homework40.task3;

public class Purchase {
    private String purchaseName;
    private Double price;

    public Purchase(String purchaseName, Double price) {
        this.purchaseName = purchaseName;
        this.price = price;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseName='" + purchaseName + '\'' +
                ", price=" + price +
                '}';
    }
}
