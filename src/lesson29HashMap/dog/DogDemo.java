package lesson29HashMap.dog;

import java.util.HashMap;
import java.util.Map;

public class DogDemo {
    public static void main(String[] args) {

        Map<Integer, Dog> map = new HashMap<>();

        map.put(1, new Dog("Oskar", 5));
        map.put(2, new Dog("Fill", 10));
        map.put(3, new Dog("Lana", 7));
        map.put(4, new Dog("Jack", 3));
        System.out.println(map);

        Dog dogFromCollection = map.get(3);
        System.out.println(dogFromCollection);

        map.put(10, dogFromCollection);
        System.out.println(map);

    }
}
