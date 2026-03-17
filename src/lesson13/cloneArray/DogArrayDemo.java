package lesson13.cloneArray;

import java.util.Arrays;

public class DogArrayDemo {
    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog("Bobik"),
                new Dog("Muhtar"),
                new Dog("Zeus")
        };

        System.out.println(Arrays.toString(dogs));

        Dog[] dogClone = dogs.clone();

        System.out.println(Arrays.toString(dogClone));

        dogs[1].setName("Sharik");
        System.out.println(Arrays.toString(dogs));
        System.out.println(Arrays.toString(dogClone));

    }
}
