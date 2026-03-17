package lesson12;

public class TaskClass {
    /*
    Запросите у пользователя положительное число
Найдите сумму всех ЧЕТНЫХ чисел от 0 до числа, которое ввел пользователь
     */



    public int metod(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i %2 == 0){
                sum = sum + i;
            }

        }
        return sum;
    }


    }

