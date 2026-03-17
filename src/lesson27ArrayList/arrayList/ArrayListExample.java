package lesson27ArrayList.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>();
        System.out.println(listString);
        System.out.println(listString.size());

        listString.add("Text1");
        listString.add("Text2");
        listString.add("Text3");
        listString.add("Text4");
        listString.add("Text5");

        System.out.println("Our collektion: " + listString);
        System.out.println("Size of our collection:  " + listString.size());

        listString.add(0,"Text100");
        System.out.println("Our collektion: " + listString);
        System.out.println("Element for index #0 = " + listString.get(0));

        listString.remove(0);
        System.out.println("Our collektion: " + listString);
        System.out.println("Element for index #0 = " + listString.get(0));

    }
}
