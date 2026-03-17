package homeWork12;

public class Numbers {
    /*
    Запросите у пользователя положительное число
Найдите сумму всех ЧЕТНЫХ чисел от 0 до числа, которое ввел пользователь
     */



    public int method(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i %2 == 0){
                sum = sum + i;
            }

        }
        return sum;
    }


    }

