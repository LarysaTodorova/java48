package lesson27ArrayList.arrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listInt.add(i);
        }
        System.out.println(listInt);
    }
}
