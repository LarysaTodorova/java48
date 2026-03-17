package homework30.task1;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {

        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(75.0, 2));
        flats.add(new Flat(52.0, 1));
        flats.add(new Flat(75.0, 3));
        flats.add(new Flat(55.0, 2));
        flats.add(new Flat(40.0, 1));

        for (Flat flat : flats) {
            System.out.println("Square of flat : " + flat.getSquare() + ", quantity rooms of flat : " + flat.getQuantityRooms());

            // flats.forEach(System.out::println);
        }
    }
}

