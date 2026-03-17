package homework37.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderDemo {
    public static void main(String[] args) {
        /*
        Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
     Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
         */

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(3, "May", 2000.0, "in processing"));
        orders.add(new Order(5, "April", 150.0, "completed"));
        orders.add(new Order(6, "May", 7000.0, "completed"));
        orders.add(new Order(1, "April", 222.2, "completed"));
        orders.add(new Order(7, "May", 500.5, "completed"));
        orders.add(new Order(9, "April", 400.0, "in processing"));
        orders.add(new Order(4, "May", 2050.5, "in processing"));

        Map<String, Double> sortedOrders = orders.stream()
                .collect(Collectors.groupingBy(Order::getDate,
                        Collectors.summingDouble(Order::getSum)
                ));
        sortedOrders.forEach((month, total) ->
                System.out.println("Month: " + month + ", total: " + total)
        );

    }
}
