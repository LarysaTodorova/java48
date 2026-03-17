package lesson29HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1,"Ruslan");
        myMap.put(2,"Alex");
        myMap.put(3,"Maria");

        System.out.println(myMap);
        System.out.println(myMap.get(2));

        Map<String, Integer> myMap2= new HashMap<>();
        myMap2.put("Ruslan", 35);
        myMap2.put("Alex", 33);
        myMap2.put("Maria", 25);
        System.out.println(myMap2);

        myMap2.put("Alex", 30);
        System.out.println(myMap2);
    }
}
