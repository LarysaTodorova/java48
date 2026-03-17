package practice12;

public class Task4 {
    public static void main(String[] args) {
        /*
        Напечатать все простые числа от 2 до 100
         */

        SimpleNumber simpleNumber = new SimpleNumber();

        for (int i = 2; i < 100 ; i++) {
            if (simpleNumber.isSimple(i)){
            System.out.println("Число " + i + " простое!");

        }


        }

    }
}
