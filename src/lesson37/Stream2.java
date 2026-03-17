package lesson37;

import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {


        int[] arr = {50, 60,70,80,90,100,110,120};

        System.out.println("Делаем с помощью циклов");

        int counter = 0;

        for (int x : arr) {
            if (x >= 90) {
                x = x + 5;
                counter++;
                if (counter <= 3) {
                    System.out.println(x);
                }
            }
        }

        System.out.println();

        System.out.println("Делаем с помощью Stream API");

        IntStream.of(50,60,70,80,90,100,110,120)

                .filter(x -> x >= 90)
                .map(x -> x + 5 )
                .limit(3)
                .forEach(x -> System.out.println(x));

    }
}
