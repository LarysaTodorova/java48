package homework28;

public class Product {
    private String id;
    private String productName;
    private String category;
    private double price;

    public Product(String id, String productName, String category, double price) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
