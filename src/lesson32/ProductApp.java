package lesson32;

public class ProductApp {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product(1,"Bike",500);
        Product product2 = new Product(2,"Auto",50000);
        Product product3 = new Product(3,"Phone",900);
        Product product4 = new Product(4,"Bike",1500);
        Product product5 = new Product(5,"Phone",1500);
        Product product6 = new Product(6,"Auto",2000);
        Product product7 = new Product(7,"Bike",2000);


        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);
        catalog.addProduct(product4);
        catalog.addProduct(product5);
        catalog.addProduct(product6);
        catalog.addProduct(product7);
        System.out.println(catalog.addProduct(product5));

        catalog.printAllProducts();
        System.out.println("========================");

      //  catalog.deleteProduct(product4);
        catalog.printAllProducts();

        catalog.findProduct(10);
        catalog.findProduct(3);

        catalog.delete(15);
        catalog.printAllProducts();





    }
}
