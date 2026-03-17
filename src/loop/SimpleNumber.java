package loop;

public class SimpleNumber {
    public static void main(String[] args) {

       // Напечатать ВСЕ простые числа от 2 до 100


        Task2 task2 = new Task2();

        for (int i = 2; i <= 100 ; i++) {
            if (task2.simple(i)){
                System.out.println("число " + i + "простое!");
            }

        }

    }
}
