package homework41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        /*
        Чтение данных из текстового файла и вывод на экран Описание: Написать программу на Java,
        которая будет читать данные из текстового файла, используя классы FileReader и BufferedReader,
        и выводить их на экран.
         */

        try (BufferedReader reader = new BufferedReader(new FileReader("src/homework41/file1"))) {
            do {
                int i = reader.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);

            } while (true);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
