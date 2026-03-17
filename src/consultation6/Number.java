package consultation6;

public class Number {
    /*
    Напишите программу, которая запрашивает у пользователя 10 чисел и необходимо найти наибольшее число из них.
     */

    public double numberEven(double number){

        double count = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0){
            count ++;

        }
        }
        return count;

    }
    public double numberOdd(double number){
       double count = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0){
            count++;
        }
        }
        return count;

    }

}
