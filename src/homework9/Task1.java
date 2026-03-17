package homework9;

import lesson5.superCalc.UserInput;

public class Task1 {
    /*Задание 1

Необходимо написать программу, где пользователю предлагается ввести число для выбора: 1, 2 или 3,
 программа должна сказать, какое число ввёл пользователь: 1, 2 или 3

Перепишите решение задачи с использованием переключателя вместо if-else:

Необходимо написать программу, где пользователю предлагается ввести число для выбора: 1, 2 или 3,
программа должна сказать, какое число ввёл пользователь: 1, 2 или 3

     */
    public static void main(String[] args) {


        UserInput userInput = new UserInput();
        int x = userInput.inputInteger("Введите число ");

        if (x == 1){
            System.out.println("Вы ввели число 1");

        }else if (x == 2){
            System.out.println("Вы ввели число 2");

        }else if (x == 3){
            System.out.println("Вы ввели число 3");

        }else {
            System.out.println("Вы ввели не верное число");
        }

        switch (x){
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println(" Вы ввели не верное число");
        }

}
}
