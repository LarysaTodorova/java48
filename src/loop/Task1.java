package loop;

public class Task1 {
    /*
    Подсчитать сумму всех четных чисел от 0 до N при том, что N вводится пользователем
     */

    public int sumNumbers(int number){

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (i %2 == 0) {
                sum = sum + i;
            }

        }return sum;
    }

}
