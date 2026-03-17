package lesson5.superCalc;

import java.util.Scanner;

public class UserInput {

    public int inputInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int userInput = scanner.nextInt();
        return userInput;
    }
    public double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double userInput = scanner.nextDouble();
        return userInput;
    }
    public String inputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;


    }
}



