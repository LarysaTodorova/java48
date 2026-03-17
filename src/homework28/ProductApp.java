package homework28;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {

     ProductRepository repository = new ProductRepository();

     Product product1 = new Product("A01", "Apple", "Fruits", 20);
     Product product2 = new Product("A02", "Banana", "Fruits", 18);
     Product product3 = new Product("A03", "Bicycle", "Vehicle", 2020);
     Product product4 = new Product("A04", "Auto", "Vehicle", 20000);
     Product product5 = new Product("A05", "Phone", "Electronic", 550);
     Product product6 = new Product("A06", "TV", "Electronic", 800);
     Product product7 = new Product("A07", "Pineapple", "Fruits", 25);


     repository.addProducts(product1);
     repository.addProducts(product2);
     repository.addProducts(product3);
     repository.addProducts(product4);
     repository.addProducts(product5);
     repository.addProducts(product6);
     repository.addProducts(product7);


     System.out.println(repository.findById("A05"));
     System.out.println(repository.findByName("Banana"));

     List<Product> productsByPrice = repository.findByPrice(20,800);
     System.out.println("Sorted products by price :");
     for (Product product : productsByPrice) {
      System.out.println(product);
     }

     Product newProduct = repository.addNewProduct("A09","Table","Furniture",300);
        System.out.println("New product:" + newProduct);


     List<Product> categoryProducts = repository.getAllProductsByCategory("Vehicle");
     System.out.println("Products from category Vehicle:");
     for (Product product : categoryProducts) {
     System.out.println(product);

    }

    }}




