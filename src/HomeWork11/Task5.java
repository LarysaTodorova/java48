package HomeWork11;

public class Task5 {
    /*
    Пользователь ввел число N. Подсчитайте количество четных и нечетных чисел в зависимости от 0 до N.
     */

    public int countEven(int number){
        int count = 0;

        for (int i = 0; i <= number ; i++) {
            if (i % 2 == 0) {
            count++;

        }
    }
        return count;
}
public int countOdd(int number) {
        int count = 0;

    for (int i = 0; i <= number ; i++) {
        if (i % 2 != 0){
            count ++;
        }

    }
    return count;
}
}
