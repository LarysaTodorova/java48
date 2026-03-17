package homework37.task7;

public class Product {
    /*
    Дана коллекция Product - название, категория, цена, количество на складе.
     Найти среднюю цену продуктов каждой категории,
     у которых количество превышает заданное значение и отсортировать по убыванию цены
     */
    private String title;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(String title, String category, double price, int stockQuantity) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
