package consultation_21_07_2025;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DrinksApp {
    public static void main(String[] args) {

        List<String> drinks = Arrays.asList("Coffee", "Ice Tea", "Cola", "Bloody Marry");

        String fileName = "drinks.txt";
        writeToFile(fileName, drinks);

    }

    public static void writeToFile(String fileName, List<String> drinks) {
        try (BufferedWriter writer = new BufferedWriter((new FileWriter((fileName))))) {
            for (String drink : drinks) {
                writer.write(drink);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
