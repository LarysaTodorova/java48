package practice.productExample;

import java.util.Scanner;

public class Product2Demo {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите название продукта:");
        String productName = myScanner.nextLine();
        System.out.println("Введите производителя:");
        String producer = myScanner.nextLine();
        System.out.println("Введите цену продукта:");
        double price = myScanner.nextDouble();
        System.out.println(" Вы создали продукт: " + productName + " " +  producer + " " + price);



        }


    }

