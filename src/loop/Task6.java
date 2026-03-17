package loop;

public class Task6 {
    /*
    Запросите у пользователя положительное число.
     Определите сумму всех ЧЕТНЫХ чисел от 0 до чисел, которые ввел пользователь
     */

    public int evenNumbers(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i %2 == 0){
                sum = sum + i;
            }

        }return sum;

    }

}
