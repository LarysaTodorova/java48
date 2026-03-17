package lesson12;

import HomeWork11.SimpleNumber;

public class Task4 {
    public static void main(String[] args) {

        SimpleNumber simpleNumber = new SimpleNumber();

        for (int i = 2; i < 100; i++) {
            if (simpleNumber.isSimple(i)) {
                System.out.println("Число " + i + "простое");

            }

        }

    }


}
