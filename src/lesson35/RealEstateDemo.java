package lesson35;

import java.util.ArrayList;
import java.util.List;

public class RealEstateDemo {
    public static void main(String[] args) {

        List<RealEstate> estates = new ArrayList<>();
        estates.add(new Flat(95.5, 4, 1500));
        estates.add(new Flat(55.5, 2, 350));
        estates.add(new House(250.5, 160.5, 2000));
        estates.add(new House(350.5, 200.6, 40000));


        print(estates);

    }

    public static void print(List<? extends RealEstate> estates) {
        for (RealEstate realEstate : estates) {
            System.out.println(realEstate);
        }

    }
}
