package homework28;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> productList = new ArrayList<>();


public Product findById(String id) {
    for (Product product : productList) {
       if (product != null) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
    }
    return null;
}

public Product findByName(String name) {
        for (Product product : productList) {
            if (product != null) {
                if (product.getProductName().equals(name)) {
                    return product;
                }
            }
        }
        return null;
}

public Product findByCategory(String category) {
        for (Product product : productList) {
            if (product != null) {
                if (product.getCategory().equals(category)) {
                    return product;
                }
            }
        }
    return null;
}

    public List<Product> getAllProductsByCategory(String category) {
        List<Product> categoryProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProduct.add(product);
            }
        }
        return categoryProduct;
    }

    public Product addNewProduct(String id,String name, String category, double price) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println("This product is already exist:");
                return null;
            }
        }
        return new Product(id,name,category,price);
    }

    public void addProducts(Product product) {
        productList.add(product);
    }


    public List<Product> findByPrice(double min, double max) {
    List<Product> productByPrice = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
               productByPrice.add(product);
            }
        }
        return productByPrice;
    }

    public List<Product> printAll(List<Product> products) {
    return new ArrayList<>(productList);

    }
}

