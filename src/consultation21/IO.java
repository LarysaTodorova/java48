package consultation21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hallow World!");
            writer.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("file.txt")) {

            do {
                int i = reader.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);

            } while (true);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
