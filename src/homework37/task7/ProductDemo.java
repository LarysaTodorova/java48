package homework37.task7;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class ProductDemo {
    public static void main(String[] args) {

        /*
        Дана коллекция Product - название, категория, цена, количество на складе.
     Найти среднюю цену продуктов каждой категории,
     у которых количество превышает заданное значение и отсортировать по убыванию цены
         */

        List<Product> products = new ArrayList<>();

        products.add(new Product("Bicycle", "Vehicle", 550, 6));
        products.add(new Product("Table", "Furniture", 320, 2));
        products.add(new Product("Bad", "Furniture", 750, 3));
        products.add(new Product("Bicycle", "Vehicle", 950, 1));
        products.add(new Product("Sofa", "Furniture", 1500, 2));
        products.add(new Product("Bicycle", "Vehicle", 2000, 1));

        int minQuantity = 1;

        Map<String, Double> sortedProducts = products.stream()
                .filter(p -> p.getStockQuantity() > minQuantity)
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double> comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedProducts.forEach((category, avgPrice) ->
                System.out.println("Category: " + category + " ; average price: " + avgPrice));

    }
}
