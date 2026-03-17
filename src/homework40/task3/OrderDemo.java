package homework40.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDemo {
    public static void main(String[] args) {
        /*
        Задача 3: Преобразование списка объектов и агрегация

Задание: Дан список объектов заказов (Order), где каждый заказ содержит список покупок (List) и дату заказа.
 Каждая покупка содержит название товара и его стоимость.
 Необходимо рассчитать общую сумму стоимости всех покупок, сделанных в текущем месяце.
         */
        Purchase purchase1 = new Purchase("Bicycle",850.5);
        Purchase purchase2 = new Purchase("Phone",1100.0);
        Purchase purchase3 = new Purchase("Bicycle",1150.5);
        Purchase purchase4 = new Purchase("Bicycle",350.5);
        Purchase purchase5 = new Purchase("Phone",950.5);
        Purchase purchase6 = new Purchase("Phone",600.5);

        List<Order> orders = new ArrayList<>();

        orders.add(new Order("October", Arrays.asList(purchase1,purchase3)));
        orders.add(new Order("September",Arrays.asList(purchase6,purchase2,purchase4)));
        orders.add(new Order("October", Arrays.asList(purchase3,purchase5,purchase1)));
        orders.add(new Order("October", Arrays.asList(purchase2,purchase3)));
        orders.add(new Order("September", Arrays.asList(purchase1,purchase6,purchase5)));

        String currentMonth = "October";

        Double sortedOrder = orders.stream()
                .filter(currentDate -> currentDate.getDate().equals(currentMonth))
                .flatMap(order -> order.getPurchases().stream())
                .mapToDouble(Purchase::getPrice)
                .sum();

        System.out.println(sortedOrder);




    }

}
