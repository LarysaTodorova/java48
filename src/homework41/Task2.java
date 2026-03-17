package homework41;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {

        /*
        Копирование содержимого одного файла в другой Описание: Написать программу на Java, которая будет копировать
        содержимое одного текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
        Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
         */


        try (BufferedReader reader = new BufferedReader(new FileReader("src/homework41/file1"));
             FileWriter writer = new FileWriter("file2.txt")) {

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                System.out.println(line);
                writer.write(System.lineSeparator());
            }
            System.out.println("Файл успешно скопирован.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



