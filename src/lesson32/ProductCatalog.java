package lesson32;

import java.util.HashSet;
import java.util.Set;

public class ProductCatalog {

    Set<Product> products = new HashSet<>();

    public boolean addProduct(Product product) {
        return products.add(product);
    }

//
//    public boolean deleteProduct(Product product) {
//        if (!products.contains(product)) {
//            return false;
//        } else {
//            System.out.println("We removed product #: " + product);
//            return products.remove(product);
//        }
//    }

    public Product findProduct(int id) {
        for (Product currentProduct : products) {
            if (currentProduct.getId() == id) {
                System.out.println("Founded product: " + currentProduct);
                return currentProduct;
            }
        }
        System.out.println("We have no such product.");
        return null;
    }

    public void printAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }

    }

    public Product delete(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                System.out.println("Product was removed.");
            }
        }
        System.out.println("We have no such product.");
        return null;

    }
}
