package lesson9;

import lesson5.superCalc.UserInput;

public class ProductDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String name = userInput.inputText("Введите название продукта:");
        int price = userInput.inputInteger("Введите цену:");

        if (name.length() >= 5 && price >0){
            Product product = new Product(name,price);
            System.out.println(product);

        }else {
            System.out.println("Ваш продукт не правильный");

        }

    }

}
