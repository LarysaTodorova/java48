package loop;

public class Task2 {
    /*
    проверка - это ли число, которое ввел пользователь - просто (делится без остатка только на 1 и на себя)
     */

    public boolean simple(int number){

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }

            }
        return true;
    }
}









