package homework40.task3;

import java.util.List;

public class Order {
    private String date;
    private List<Purchase> purchases;

    public Order(String date, List<Purchase> purchases) {
        this.date = date;
        this.purchases = purchases;
    }

    public String getDate() {
        return date;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
