package homework37.task9;

public class Order {
    /*
    Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
     Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
     */
    private int id;
    private String date;
    private double sum;
    private String status;

    public Order(int id, String date, double sum, String status) {
        this.id = id;
        this.date = date;
        this.sum = sum;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getSum() {
        return sum;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", sum=" + sum +
                ", status='" + status + '\'' +
                '}';
    }
}
