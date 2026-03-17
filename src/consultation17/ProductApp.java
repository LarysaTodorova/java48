package consultation17;

public class ProductApp {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Apple", 15);
        Product product2 = new Product(2, "Tomato", 11);
        Product product3 = new Product(3, "Potato", 12);
        Product product4 = new Product(4, "Lemon", 11);
        Product product5 = new Product(1, "Orange", 13);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);
        catalog.addProduct(product4);

        System.out.println(catalog);

        System.out.println(catalog.findProductById(2));
        System.out.println("Product for delite:" + catalog.deleteProduct(3));
        System.out.println(catalog);

        System.out.println("If orange was added? " + catalog.addProduct(product5));
        System.out.println(catalog);

    }
}
