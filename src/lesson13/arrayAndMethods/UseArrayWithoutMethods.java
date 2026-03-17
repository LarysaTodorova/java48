package lesson13.arrayAndMethods;

import lesson5.superCalc.UserInput;

import java.util.Arrays;

public class UseArrayWithoutMethods {
    /*
    1) создать массив той длины, которую введет пользователь
    2) наполнить массив данными, которые введет пользователь
    3) посчитать сумму всех элементов массива
    4) найти максимальное значение среди элементов массива


   для п1:

   - создать Сканер (или использовать наш класс UserInput)
   - запросить у пользователя длину массива
   - создать массив нужной длины


    для п2:
    в цикле по длине массива для КАЖДОГО элемента массива нужно
    запросить у пользователя данные и сохранить то что он ввел
    в соответствующей ячейке массива

    для п3:
    объявить переменную Sum в которой будет храниться сумма
    всех элементов и присваиваем ей первоначальное значение 0

    в цикле по длине массива мы к этой переменной Sum добавляем
    значение i-ого элемента нашего массива

    для п4:
    объявляем переменную max в которой будет храниться максимальное
    значение из всех элементов нашего массива и присваиваем ей первоначальное
    значение равное первому элементу нашего массива (с индексом 0)

    в цикле по всем элементам массива, начиная со второго мы сравниваем каждый
    элемент с тем значением, которое на этот момент хранится в переменной max

    если вдруг наш текущий элемент массива оказывается БОЛЬШЕ чем то значение,
    которое на текущий момент времени хранится в переменной max, то это означает,
    что в переменную max надо сохранить значение из текущего элемента массива


     */
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int lengthOurArray = userInput.inputInteger("Введите длину массива:");
        int[] workingArray = new int[lengthOurArray];
        System.out.println(Arrays.toString(workingArray));

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = userInput.inputInteger("Введите значение " + i + " - ого элемента массива:");


        }

        System.out.println(Arrays.toString(workingArray));

        int sum = 0;

        for (int   i = 0; i < workingArray.length; i++) {
            sum = sum + workingArray[i];
        }
        System.out.println("Суммма всех  элементов = " + sum);

        int maxElementVaiue = workingArray[0];

        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] > maxElementVaiue) {
                maxElementVaiue = workingArray[i];
            }

        }
        System.out.println("Максимальное значение элементов массива = " + maxElementVaiue);

    }


}
