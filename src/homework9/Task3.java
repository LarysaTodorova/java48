package homework9;

import lesson5.superCalc.UserInput;

public class Task3 {
    /*
    Использовать оператор переключателя)

Программа запрашивает пользователя ввести число от 1 до 7.
 Если число равно 1, выводим на консоль «Понедельник»,
 2 – «Вторник» и так далее. Если 6 или 7 – «Выходной».

  */

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int count = userInput.inputInteger("Введите число:");

        switch (count){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;

            case 7:
                System.out.println("Выходной");
                break;

            }

        }

    }


