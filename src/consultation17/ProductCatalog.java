package consultation17;

import java.util.HashSet;
import java.util.Set;

public class ProductCatalog {
    private Set<Product> data;

    public ProductCatalog() {
        this.data = new HashSet<>();
    }

    public boolean addProduct(Product product) {
        if (this.data.contains(product)) {
            return false;
        }
        this.data.add(product);
        return true;
    }

    public boolean deleteProduct(int productId) {
        Product targetProduct = findProductById(productId);

        if (targetProduct == null) {
            return false;
        }
        this.data.remove(targetProduct);
        return true;
    }

    public Product findProductById(int productId) {
        for (Product product : this.data) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "ProductCatalog{" +
                "data=" + data +
                '}';
    }
}
