package lesson5.productExample;

import lesson5.superCalc.UserInput;

public class ProductDemo {
    public static void main(String[] args) {


        UserInput userInput = new UserInput();

        Product product = new Product();
        product.productName = userInput.inputText(" Введите название продукта: ");
        product.producer = userInput.inputText(" Введите название производителя: ");
        product.price = userInput.inputDouble(" Введите цену продукта: ");

        System.out.println(" Продукт: " + product.productName);
        System.out.println(" Производитель: " + product.producer);
        System.out.println(" Цена: " + product.price);



    }
}
